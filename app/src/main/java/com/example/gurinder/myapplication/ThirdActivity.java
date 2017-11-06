package com.example.gurinder.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;


public class ThirdActivity extends AppCompatActivity {

    private Button Login1;
    private Button Login2;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Login1 = (Button)findViewById(R.id.btn);
        Login2 = (Button)findViewById(R.id.button4);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Layout
        RelativeLayout rel = new RelativeLayout(this);
       // rel.setBackgroundColor(Color.CYAN);

        //Button
        Button smbutton = new Button(this);
        smbutton.setText("Click on me..!!");
        //smbutton.setBackgroundColor(Color.BLUE);


        //Button
        Button smbutton1 = new Button(this);
        smbutton1.setText("Heloooo..!!");
        //smbutton.setBackgroundColor(Color.BLUE);


        //Username input
        EditText username = new EditText(this);


         smbutton.setId(1);
        smbutton1.setId(3);
         username.setId(2);


        RelativeLayout.LayoutParams btndetails =new RelativeLayout.LayoutParams(
        RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams btndetails1 =new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernameDetails =new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        usernameDetails.addRule(RelativeLayout.ABOVE,smbutton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        btndetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btndetails.addRule(RelativeLayout.CENTER_VERTICAL);

        btndetails1.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btndetails1.addRule(RelativeLayout.CENTER_VERTICAL);
        btndetails1.addRule(RelativeLayout.BELOW,smbutton.getId());

        Resources r = getResources();
        int px =(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200 , r.getDisplayMetrics()
        );

        username.setWidth(px);

        rel.addView(smbutton, btndetails);
        //rel.addView(smbutton1, btndetails1);
       // rel.addView(username, usernameDetails);
        setContentView(rel);


        smbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });


        smbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });


    }
}
