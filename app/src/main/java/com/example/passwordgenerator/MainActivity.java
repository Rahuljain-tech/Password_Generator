package com.example.passwordgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.passwordgenerator.models.PasswordGenerator;

public class MainActivity extends AppCompatActivity {

    private TextView text_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        text_value = findViewById(R.id.text_value);

        text_value.setText(PasswordGenerator.generatePassword(9));

    }

}