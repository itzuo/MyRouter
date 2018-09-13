package com.zxj.module1;

import android.util.Log;

import com.zxj.base.TestService;
import com.zxj.router.annotation.Route;
import com.zxj.router.core.template.IService;

@Route(path = "/module1/service")
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        Log.i("Service", "我是Module1模块测试服务通信");
    }
}
