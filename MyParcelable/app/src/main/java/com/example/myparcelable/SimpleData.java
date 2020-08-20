package com.example.myparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {

     int number;

    public SimpleData(int number, String message) {
        this.number = number;
        this.message = message;
    }

    protected SimpleData(Parcel in) {
        number = in.readInt();
        message = in.readString();
    }

    public static final Creator<SimpleData> CREATOR = new Creator<SimpleData>() {
        @Override
        public SimpleData createFromParcel(Parcel in) {
            return new SimpleData(in);
        }

        @Override
        public SimpleData[] newArray(int size) {
            return new SimpleData[size];
        }
    };

    public int getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    String message;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(number);
        parcel.writeString(message);
    }
}
