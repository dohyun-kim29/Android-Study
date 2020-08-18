package com.example.applicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;

public class MainActivity extends AppCompatActivity {

    TextView txtName;
    TextView txtNumFront;
    TextView txtNumBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtNumFront = findViewById(R.id.txtNumFront);
        txtNumBack = findViewById(R.id.txtNumBack);

        Button btnCheck = findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtName.getText().toString();
                int tenThousandsAge = Integer.parseInt(txtNumFront.getText().toString());
                int age = tenThousandsAge/10000;
                String gender;
                if (Integer.parseInt(txtNumBack.getText().toString())/2 == 1 ) {
                    gender = "남";
                } else {
                    gender = "여";
                }

                Toast.makeText(MainActivity.this, name + "님은" + age + "살" + gender + "입니다.", Toast.LENGTH_LONG).show();
            }
        });
    }
}