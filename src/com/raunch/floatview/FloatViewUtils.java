package com.raunch.floatview;

import android.content.Context;
import android.graphics.PixelFormat;
import android.view.Gravity;
import android.view.WindowManager;

public class FloatViewUtils {
	 public static void createFloatView(Context context)  
	    {  
	        //获取LayoutParams对象  
		    WindowManager mWindowManager;  
		    WindowManager.LayoutParams wmParams;  
	        wmParams = new WindowManager.LayoutParams();  
	          
	        //获取的是LocalWindowManager对象  
	        mWindowManager = (WindowManager)context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE); 
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
	        FloatLayout view = new FloatLayout(context);         
	          
	        mWindowManager.addView(view, wmParams);  
	        //setContentView(R.layout.main);       
	          
	    }  

}
