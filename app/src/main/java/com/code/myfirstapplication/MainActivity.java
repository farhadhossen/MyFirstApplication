package com.code.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editText = findViewById(R.id.idTextView);
        button = findViewById(R.id.idButtom);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textView.setText("Welcome to Android Studio");

                value = editText.getText().toString();



                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("key",value);
                startActivity(i);
            }
        });
    }
}