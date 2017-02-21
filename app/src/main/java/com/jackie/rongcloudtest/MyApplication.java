package com.jackie.rongcloudtest;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by jackie on 2017/2/21 0021 14:26.
 * QQ : 971060378
 * Used as : xxx
 */


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
    }
}
