package com.example.lurenman.eventhandlingdemo.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * @author: baiyang.
 * Created on 2017/10/27.
 * 事件默认，每次处理事件都是先从父容器dispatchTouchEvent->onInterceptTouchEvent
 * 到下一个事件dispatchTouchEvent->  理解就好
 * 参考
 * http://blog.csdn.net/javazejian/article/details/50479894
 */

public class MyLinearLayoutView extends LinearLayout {
    private static final String TAG = "MyLinearLayoutView";
    public MyLinearLayoutView(Context context) {
        super(context);
    }

    public MyLinearLayoutView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        String str  = "default";
        switch (ev.getAction())
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
        boolean b = super.onInterceptTouchEvent(ev);
        Log.e(TAG, "onInterceptTouchEvent:"+str );
        Log.e(TAG, "onInterceptTouchEvent:"+b);
        return b;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        String str  = "default";
        switch (ev.getAction())
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
        boolean b = super.dispatchTouchEvent(ev);
        Log.e(TAG, "dispatchTouchEvent:"+str );
        Log.e(TAG, "dispatchTouchEvent:"+b);
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
        Log.e(TAG, "onTouchEvent:"+str );
        Log.e(TAG, "onTouchEvent:"+b );
        return b;
    }
}
