package com.example.gurinder.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FourthActivity extends AppCompatActivity {
    private Button b1 ;
    private Button b2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.change,new FragmentOne());
                f.commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.support.v4.app.FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.change,new FragmentTwo());
                f.commit();
            }
        });
    }
}


