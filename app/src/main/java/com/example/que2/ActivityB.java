package com.example.que2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.d("ActivityLifecycle", "ActivityB - onCreate");
        showToast("ActivityB - onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ActivityLifecycle", "ActivityB - onStart");
        showToast("ActivityB - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ActivityLifecycle", "ActivityB - onResume");
        showToast("ActivityB - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ActivityLifecycle", "ActivityB - onPause");
        showToast("ActivityB - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ActivityLifecycle", "ActivityB - onStop");
        showToast("ActivityB - onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ActivityLifecycle", "ActivityB - onDestroy");
        showToast("ActivityB - onDestroy");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
