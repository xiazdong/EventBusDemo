package com.example.xiazdong.eventbusdemo;

import android.content.Context;
import android.content.Intent;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by xiazdong on 2017/7/26.
 */

public class ViewModel {
    public void startActivity(Context context, int id) {
        Class clazz = null;
        switch (id) {
            case R.id.btn_1:
                clazz = Demo1Activity.class; break;
            case R.id.btn_jump1:
                clazz = PostEventActivity.class; break;
        }
        Intent intent = new Intent(context, clazz);
        context.startActivity(intent);
    }

    public void postMessage(PostEventActivity activity, MessageEvent event) {
        EventBus.getDefault().post(event);
        activity.finish();
    }
}
