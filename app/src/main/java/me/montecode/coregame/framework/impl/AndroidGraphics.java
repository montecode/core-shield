package me.montecode.coregame.framework.impl;

import android.graphics.*;

import me.montecode.coregame.framework.*;

public class AndroidGraphics implements Graphics
{
	Bitmap frameBuffer;
	Canvas canvas;

	public AndroidGraphics(Bitmap frameBuffer)
	{
		this.frameBuffer = frameBuffer;
		this.canvas = new Canvas(frameBuffer);
	}

	@Override
	public Canvas getCanvas()
	{
		return canvas;
	}

	@Override
	public int getWidth()
	{
		return canvas.getWidth();
	}

	@Override
	public int getHeight()
	{
		return canvas.getHeight();
	}
}
