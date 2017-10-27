package com.example.lurenman.eventhandlingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lurenman.eventhandlingdemo.views.EventButton;
import com.example.lurenman.eventhandlingdemo.views.MyLinearLayoutView;

public class MainActivity extends AppCompatActivity {

    private MyLinearLayoutView ml_LinearLayout;
    private EventButton eb_EventButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ml_LinearLayout = (MyLinearLayoutView) findViewById(R.id.ml_LinearLayout);
        eb_EventButton = (EventButton) findViewById(R.id.eb_EventButton);
    }
}
