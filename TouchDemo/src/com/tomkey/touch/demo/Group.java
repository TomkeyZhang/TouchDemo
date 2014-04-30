package com.tomkey.touch.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class Group extends LinearLayout {
    private String TAB = "ViewGroup";

    public Group(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Group(Context context) {
        super(context);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch(ev.getAction()) {
        case MotionEvent.ACTION_DOWN:
            Log.d(TAB, "dispatchTouchEvent action:ACTION_DOWN");
            break;
        case MotionEvent.ACTION_UP:
            Log.d(TAB, "dispatchTouchEvent action:ACTION_UP");
            break;
        }
        return super.dispatchTouchEvent(ev);
//        return false;
    }
 
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        //true表示拦截后交给自己的onTouchEvent处理，false表示传递给子View
        switch(ev.getAction()) {
        case MotionEvent.ACTION_DOWN:
            Log.d(TAB, "onInterceptTouchEvent action:ACTION_DOWN");
            break;
        case MotionEvent.ACTION_UP:
            Log.d(TAB, "onInterceptTouchEvent action:ACTION_UP");
            break;
        }
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
        return super.onTouchEvent(event);
//        return true;
    }
}
