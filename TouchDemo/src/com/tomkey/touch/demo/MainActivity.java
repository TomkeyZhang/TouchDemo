package com.tomkey.touch.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;

public class MainActivity extends Activity {
    private String TAB = "Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAB, "dispatchTouchEvent action:ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAB, "dispatchTouchEvent action:ACTION_UP");
                break;
        }
        super.dispatchTouchEvent(ev);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
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
