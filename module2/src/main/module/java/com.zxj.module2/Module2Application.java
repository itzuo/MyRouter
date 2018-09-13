package com.zxj.module2;

import android.app.Application;

import com.zxj.router.core.MyRouter;

public class Module2Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MyRouter.init(this);
    }
}
