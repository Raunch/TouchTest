package com.raunch.mytouch;

import java.util.ArrayList;

import com.raunch.floatview.FloatLayout;
import com.raunch.floatview.FloatViewUtils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {
	private Button mGetButton;
	private Button mPayButton;
	//private TextView mTypeTV;
	private TextView mMountTV;
	private TextView mStatusTV;
	
	private final String TAG = "TouchTest";
	

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mGetButton = (Button) findViewById(R.id.btn_get);
		mPayButton = (Button) findViewById(R.id.btn_pay);

		mPayButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				FloatViewUtils.createFloatView(MainActivity.this);
			}
		});

		mGetButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Log.i(TAG, "Nothing to fuck");
			}
		});

	}
    
   
        
        
       
    
    

}
