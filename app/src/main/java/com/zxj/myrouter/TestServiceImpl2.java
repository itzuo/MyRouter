package com.zxj.myrouter;

import android.util.Log;

import com.zxj.base.TestService;
import com.zxj.router.annotation.Route;
import com.zxj.router.core.template.IService;

@Route(path = "/main/service2")
public class TestServiceImpl2 implements TestService {


    @Override
    public void test() {
        Log.i("Service", "我是app模块测试服务通信2");
    }
}
