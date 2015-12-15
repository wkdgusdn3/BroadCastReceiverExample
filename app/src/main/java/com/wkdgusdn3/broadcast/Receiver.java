package com.wkdgusdn3.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "브로드 캐스트를 받았습니다.", Toast.LENGTH_LONG).show();
    }
}
