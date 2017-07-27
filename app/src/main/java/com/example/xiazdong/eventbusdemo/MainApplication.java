package com.example.xiazdong.eventbusdemo;

import android.app.Application;


import com.xiazdong.eventbusdemo.EventBusIndex;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by xiazdong on 17/7/26.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.builder().addIndex(new EventBusIndex()).installDefaultEventBus();
    }
}
