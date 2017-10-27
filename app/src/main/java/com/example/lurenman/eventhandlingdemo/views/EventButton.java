package com.example.lurenman.eventhandlingdemo.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * @author: baiyang.
 * Created on 2017/10/27.
 */

public class EventButton extends Button {
    private static final String TAG = "EventButton";
    public EventButton(Context context) {
        super(context);
    }

    public EventButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EventButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        String str  = "default";
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                str = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                str = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                str = "ACTION_UP";
                break;
//            default:
//                str = "default";
//                break;
        }
        boolean b = super.dispatchTouchEvent(event);
        Log.e(TAG, "dispatchTouchEvent:"+str );
        Log.e(TAG, "dispatchTouchEvent:"+b );
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String str  = "default";
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                str = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                str = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                str = "ACTION_UP";
                break;
//            default:
//                str = "default";
//                break;
        }
        boolean b = super.onTouchEvent(event);
        Log.e(TAG, "onTouchEvent: "+str);
        //return true;
        Log.e(TAG, "onTouchEvent: "+b);
        return b;
    }
}
