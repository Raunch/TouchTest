package com.raunch.mytouch;

import java.util.ArrayList;

import android.app.Activity;
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
        mWindowManager = this.getWindowManager();  
        Log.i(TAG, "mWindowManager1--->" + this.getWindowManager());  
        //mWindowManager = getWindow().getWindowManager();  
        Log.i(TAG, "mWindowManager2--->" + getWindow().getWindowManager());  
       
        //获取的是CompatModeWrapper对象  
        //mWindowManager = (WindowManager) getApplication().getSystemService(Context.WINDOW_SERVICE);  
        Log.i(TAG, "mWindowManager3--->" + mWindowManager);  
        wmParams.type = LayoutParams.TYPE_APPLICATION;  
        wmParams.format = PixelFormat.RGBA_8888;;  
        wmParams.flags = LayoutParams.FLAG_NOT_FOCUSABLE;  
        wmParams.gravity = Gravity.LEFT | Gravity.TOP;  
        wmParams.x = 0;  
        wmParams.y = 0;  
        wmParams.width = WindowManager.LayoutParams.MATCH_PARENT;  
        wmParams.height = WindowManager.LayoutParams.MATCH_PARENT;  
        
        ImageView view = new ImageView(this);
        view.setLayoutParams(new LayoutParams(android.view.ViewGroup.LayoutParams.FILL_PARENT, android.view.ViewGroup.LayoutParams.FILL_PARENT));
        view.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Log.i(TAG,"fucking here");
				return true;
			}
		});
        view.setBackgroundColor(Color.TRANSPARENT);
          
          
        mWindowManager.addView(view, wmParams);  
        //setContentView(R.layout.main);       
          
    }  
        
        
       
    
    

}
