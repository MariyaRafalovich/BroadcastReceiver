package com.example.mariya.broadcastmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    private static String TAG = CustomReceiver.class.getSimpleName();

    public CustomReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(CustomReceiver.TAG, "CUSTOM_ACTION event caught!");
        Toast.makeText(context, "CUSTOM_ACTION", Toast.LENGTH_SHORT).show();
    }
}
