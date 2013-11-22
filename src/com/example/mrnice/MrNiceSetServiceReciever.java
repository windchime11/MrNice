package com.example.mrnice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MrNiceSetServiceReciever extends BroadcastReceiver {

	private static final String LOGGING_TAG = "MrNiceSetServiceReciever";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d(LOGGING_TAG," MrNiceSetServiceReciever onReceive");
		Intent service = new Intent(context, SpecialDaySetService.class);
		context.startService(service);

	}

}
