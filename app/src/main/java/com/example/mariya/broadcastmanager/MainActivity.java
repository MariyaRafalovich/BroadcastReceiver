package com.example.mariya.broadcastmanager;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView whichView;
    private SystemBroadcastReceiver MyLocalReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button ButBroadcast = (Button) findViewById(R.id.btnTrigBroadcast);
            ButBroadcast.setOnClickListener(this);
            Button SentBroadcast = (Button) findViewById(R.id.btnTrigLocalBroadcast);
            SentBroadcast.setOnClickListener(this);


            LocalBroadcastManager.getInstance(this).registerReceiver(this.MyLocalReceiver, new IntentFilter("my-custom-intentfilter"));
        }

    @Override
    public void onClick(View v) {
        if(whichView.getId() == R.id.btnTrigBroadcast){
            Log.i(MainActivity.TAG, "CUSTOM_BROADCAST");

            Intent customBroadcastIntent = new Intent();
            customBroadcastIntent.setAction(getString(R.string.android_intent_action_CUSTOM_ACTION));
            sendBroadcast(customBroadcastIntent);
          }else if(whichView.getId() == R.id.btnTrigLocalBroadcast){
                Log.i(MainActivity.TAG, "CUSTOM_BROADCAST_SECOND");
                LocalBroadcastManager.getInstance(this).sendBroadcast(
                        new Intent().setAction(getString(R.string.android_intent_action_CUSTOM_ACTION)));
            }
        }

  }




