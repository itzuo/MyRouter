package com.zxj.module2;

import android.util.Log;

import com.zxj.base.TestService;
import com.zxj.router.annotation.Route;
import com.zxj.router.core.template.IService;

@Route(path = "/module2/service")
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        Log.i("Service", "我是Module2模块测试服务通信");
    }
}
