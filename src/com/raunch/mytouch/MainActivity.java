package com.raunch.mytouch;

import java.util.ArrayList;

import com.raunch.floatview.FloatLayout;

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
	
	WindowManager mWindowManager;  
    WindowManager.LayoutParams wmParams;  
	
	
	
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
				createFloatView();
			}
		});

		mGetButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Log.i(TAG, "Nothing to fuck");
			}
		});

	}
    
    private void createFloatView()  
    {  
        //获取LayoutParams对象  
        wmParams = new WindowManager.LayoutParams();  
          
        //获取的是LocalWindowManager对象  
        mWindowManager = (WindowManager)getApplicationContext().getSystemService(Context.WINDOW_SERVICE); 
        //mWindowManager = getWindow().getWindowManager();  
       
        wmParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;  
        wmParams.format = PixelFormat.RGBA_8888;;  
        wmParams.flags = WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        //wmParams.flags = WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM | WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        //wmParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
        wmParams.gravity = Gravity.CENTER; 
        /* 
        wmParams.width = WindowManager.LayoutParams.MATCH_PARENT;  
        wmParams.height = WindowManager.LayoutParams.MATCH_PARENT;  
        */
        wmParams.width = 50;  
        wmParams.height = 50; 
        FloatLayout view = new FloatLayout(this);         
          
        mWindowManager.addView(view, wmParams);  
        //setContentView(R.layout.main);       
          
    }  
        
        
       
    
    

}
