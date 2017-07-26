package com.example.xiazdong.eventbusdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xiazdong.eventbusdemo.databinding.ActivityPostEventBinding;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class PostEventActivity extends AppCompatActivity {
    ActivityPostEventBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_post_event);
        binding.setEvent(new MessageEvent("xiazdong", 25));
        binding.setPresenter(new ViewModel());
        binding.setActivity(this);
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageReceived(MessageEvent event) {
        binding.text.setText(event.name + "," + event.age);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
