package com.example.gurinder.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContentActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1);

        Bundle applesData =getIntent().getExtras();
        if(applesData == null){
            return;

        }
        String applesMessage = applesData.getString("appleMessage");
        final TextView text =(TextView)findViewById(R.id.contentView);
        text.setText(applesMessage);
    }
}
