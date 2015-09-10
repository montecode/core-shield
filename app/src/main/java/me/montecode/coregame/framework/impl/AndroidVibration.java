package me.montecode.coregame.framework.impl;

import android.os.Vibrator;
import android.content.Context;

import me.montecode.coregame.framework.Vibration;

public class AndroidVibration implements Vibration
{
	Vibrator vibrator;

	public AndroidVibration(Context context)
	{
		vibrator = 
			(Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
	}

	@Override
	public void vibrate(int time)
	{
			vibrator.vibrate((long)(time));
	}
}
