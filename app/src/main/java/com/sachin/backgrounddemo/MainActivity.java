package com.sachin.backgrounddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View myView = findViewById(R.id.startButton);
        myView.performClick();
    }

    public void startBGService(View view) {
//        Intent intent = new Intent(this, MyBackgroundService.class);
//        intent.setAction("BackgroundProcess");
        Log.d("CLICKED", "clicked");
//
//        // Set the task
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
//
//        AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
//
//        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, 0, 500, pendingIntent);
//
//        finish();

//        Toast.makeText(this, "Running from Background", Toast.LENGTH_SHORT).show();

        AlarmManager alarmManager=(AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this, MyBackgroundService.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
        alarmManager.set(AlarmManager.RTC, System.currentTimeMillis() +  1000, pendingIntent);
    }
}
