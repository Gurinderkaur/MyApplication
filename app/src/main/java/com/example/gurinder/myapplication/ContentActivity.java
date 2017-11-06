package com.example.gurinder.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class ContentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }

    public void info(View view) {
        Intent intent = new Intent(this, ContentActivity1.class);
        final EditText applesInput = (EditText)findViewById(R.id.applesInput);
         String userMessage = applesInput.getText().toString();
        intent.putExtra("appleMessage" ,userMessage);
        startActivity(intent);
    }



}
