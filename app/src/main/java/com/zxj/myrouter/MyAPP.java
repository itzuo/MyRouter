package com.zxj.myrouter;

import android.app.Application;

import com.zxj.router.core.MyRouter;

public class MyAPP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MyRouter.init(this);
    }
}
