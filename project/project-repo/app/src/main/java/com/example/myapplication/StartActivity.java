package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.fragments.ProfileFragment;

public class StartActivity extends AppCompatActivity {

    Button enterButton;
    EditText firstName, lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        firstName = findViewById(R.id.editText1);
        lastName = findViewById(R.id.editText2);
        enterButton = findViewById(R.id.enterButton);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFirst = firstName.getText().toString();
                String strLast = lastName.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                intent.setClass(StartActivity.this, MainActivity.class);
                intent.putExtra("firstName", strFirst);
                intent.putExtra("lastName", strLast);
                startActivity(intent);
            }
        });
    }
}
