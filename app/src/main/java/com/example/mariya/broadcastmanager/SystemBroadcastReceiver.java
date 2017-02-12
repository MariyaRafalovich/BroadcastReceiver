package com.example.mariya.broadcastmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SystemBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = SystemBroadcastReceiver.class.getSimpleName();

      public SystemBroadcastReceiver() {

      }

       @Override
       public void onReceive(Context context, Intent intent) {
           if (intent.getAction().equals(Intent.ACTION_BATTERY_LOW)){
               Log.v(SystemBroadcastReceiver.TAG, "Battery-low-event!");
           } else if (intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
               Log.v(SystemBroadcastReceiver.TAG, "AIRPLANE MODE!");
           }
       }

  // @Override
  //  public void onReceive(Context context, Intent intent) {
  //      switch (intent.getAction()){
  //          case Intent.ACTION_AIRPLANE_MODE_CHANGED:
  //          Log.v(SystemBroadcastReceiver.TAG, "Battery-low-event!");
  //          break;
  //          case Intent.ACTION_BATTERY_LOW:
  //          Log.v(SystemBroadcastReceiver.TAG, "AIRPLANE MODE!");
  //          break;
  //      }


     }



