package com.raunch.floatview;

import com.raunch.mytouch.R;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class FloatLayout extends LinearLayout{
	private final String TAG = "FloatView";
	private Context mContext;
	private LinearLayout mFloatLayout;
	private Button mFloatButton;
	private int mLeft;
	private int mTop;
	private int mRight;
	private int mBottom;

	public FloatLayout(Context context) {
		super(context);
		mContext = context;
		mFloatLayout = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.raunch_float_view, null);
		mFloatButton = (Button) mFloatLayout.findViewById(R.id.float_button);
		mFloatButton.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				Log.i(TAG,"You have Clicked me !");
				
			}
		});
		addView(mFloatLayout);
	}

	/*
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		
		printCoordinateInfo();
		int x = (int) ev.getX();
		int y = (int) ev.getY();
		Log.i(TAG, "X is " + x + " and Y is " + y);
		if (hasContained(x, y)) {
			return true;
		} else {
			return false;
		}
	}
	*/
	

	/*
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.i(TAG, "Touch here and do nothing");
		int x = (int) event.getX();
		int y = (int) event.getY();
		if (hasContained(x, y)) {
			return true;
		} else {
			return false;
		}
	}
	*/
	

	@Override
	protected void onFinishInflate() {
		// TODO Auto-generated method stub
		super.onFinishInflate();		
		printCoordinateInfo();  
	}
	
	private boolean hasContained(int x, int y) {
		if ((mLeft <= x && mRight >= x) && (mTop <= y && mBottom >= y)) {
			return true;
		} else {
			return false;
		}
	}
	
	private void printCoordinateInfo() {
		mLeft = mFloatButton.getLeft();
		mTop = mFloatButton.getTop();
		mRight = mFloatButton.getRight();
		mBottom = mFloatButton.getBottom();
		Log.i(TAG, "The Button left is " + mLeft + " top is " + mTop + " the right is " + mRight + " the bottom is " + mBottom);
	}

}
