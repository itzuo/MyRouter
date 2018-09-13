package com.zxj.module1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.zxj.base.TestService;
import com.zxj.router.annotation.Extra;
import com.zxj.router.annotation.Route;
import com.zxj.router.core.MyRouter;

@Route(path = "/module1/test")
public class Module1Activity extends AppCompatActivity {
    @Extra
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);
        MyRouter.getInstance().inject(this);
        Log.i("module1", "我是模块1:" + msg);

        TestService testService = (TestService) MyRouter.getInstance().build("/main/service1")
                .navigation();
        testService.test();

        TestService testService1 = (TestService) MyRouter.getInstance().build("/main/service2")
                .navigation();
        testService1.test();

        TestService testService2 = (TestService) MyRouter.getInstance().build("/module1/service")
                .navigation();
        testService2.test();

        TestService testService3 = (TestService) MyRouter.getInstance().build("/module2/service")
                .navigation();
        testService3.test();
    }

    public void mainJump(View view) {
        MyRouter.getInstance().build("/main/test").withString("a",
                "从Module1").navigation(this);
    }

    public void module2Jump(View view) {
        MyRouter.getInstance().build("/module2/test").withString("msg",
                "从Module1").navigation(this);
    }
}
