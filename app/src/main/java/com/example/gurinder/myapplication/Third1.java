package com.example.gurinder.myapplication;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Third1 extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;

                case R.id.navigation_dashboard:
                    return true;

                case R.id.navigation_notifications:
                    return true;

                case R.id.navigation_search:
//                    android.support.v4.app.FragmentTransaction f = getSupportFragmentManager().beginTransaction();
//                    f.replace(R.id.changeLayout,new FragmentSearch());
//                    f.commit();
                    FragmentSearch f1 = new FragmentSearch();
                    android.support.v4.app.FragmentManager f = getSupportFragmentManager();
                    f.beginTransaction().replace(R.id.changeLayout, f1).commit();

                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third1);

      //  mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void callContent(View view) {
        Intent intent = new Intent(this, ContentActivity.class);
        startActivity(intent);
    }
}
