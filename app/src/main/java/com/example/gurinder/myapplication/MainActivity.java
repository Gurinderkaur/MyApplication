package com.example.gurinder.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button HelloB;

    private int counter =5;
    static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_main);
        Log.i(TAG, "Application is running..........!!!!!!!!!");

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);
        Info.setText("Number of attempts remaining = 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }



    public void validate(String username, String userPassword){
        Log.d("TAG", username.toString());
        Log.d("TAG1", userPassword.toString());


      if((username.equals("admin")) && (userPassword.equals("123"))){
           Log.d("TAG3", "In Login part");
          Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
           startActivity(intent);
       }

       else
       {
           Log.d("TAG4", "else part counter");

          counter--;

          Info.setText("Number of attempts remaining : " +String.valueOf(counter));

          if(counter==0){
               Login.setEnabled(false);
           }
       }
    }

    public void callIntent1(View view) {
        Intent intent = new Intent(this, Third1.class);
        startActivity(intent);
    }

    public void callIntent3(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void callcontent(View view) {
        Intent intent = new Intent(this, ContentActivity.class);
        startActivity(intent);
    }


}
