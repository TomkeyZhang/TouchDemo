package com.tomkey.touch.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class Item extends TextView {

    public Item(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Item(Context context) {
        super(context);
    }
    private String TAB = "View";
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch(event.getAction()) {
        case MotionEvent.ACTION_DOWN:
            Log.d(TAB, "dispatchTouchEvent action:ACTION_DOWN");
            break;
        case MotionEvent.ACTION_UP:
            Log.d(TAB, "dispatchTouchEvent action:ACTION_UP");
            break;
        }
        super.dispatchTouchEvent(event);
        return false;
    }
 
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()) {
        case MotionEvent.ACTION_DOWN:
            Log.d(TAB, "---onTouchEvent action:ACTION_DOWN");
            break;
        case MotionEvent.ACTION_UP:
            Log.d(TAB, "---onTouchEvent action:ACTION_UP");
            break;
        }
        super.onTouchEvent(event);
        return false;
    }
}
