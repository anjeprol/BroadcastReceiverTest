package com.example.prolan.broadcastreceivertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Prolan on 04/02/2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        CharSequence intentData = intent.getCharSequenceExtra("message");
        Toast.makeText(context,"Received the Intent's message:"+intentData,Toast.LENGTH_LONG).show();
    }
}
