package com.example.activitycycle;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d("ActivityLifeCycle", "OnCreate invoked");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("ActivityLifeCycle", "OnStart invoked");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("ActivityLifeCycle", "OnResume invoked");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("ActivityLifeCycle", "OnPause invoked");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("ActivityLifeCycle", "OnStop invoked");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("ActivityLifeCycle", "OnDestroy invoked");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("ActivityLifeCycle", "OnRestart invoked");
    }


}