package com.sachin.backgrounddemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.SystemClock;
import android.widget.Toast;

public class MyBackgroundService extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Ringtone ringtone = RingtoneManager.getRingtone(context, RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));

        ringtone.play();

        Toast.makeText(context, "Running from Background", Toast.LENGTH_SHORT).show();

        SystemClock.sleep(3000);

        ringtone.stop();
    }
}
