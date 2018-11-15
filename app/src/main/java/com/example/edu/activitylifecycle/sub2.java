package com.example.edu.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class sub2 extends AppCompatActivity {
    final String TAG="States";//final은 유일할때 쓴다.
    final String ACTIVITY="sub2Activity:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, ACTIVITY+" onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, ACTIVITY+" onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, ACTIVITY+" onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, ACTIVITY+" onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, ACTIVITY+" onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, ACTIVITY+" onRsume()");
    }
}
