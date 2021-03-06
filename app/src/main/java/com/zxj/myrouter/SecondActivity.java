package com.zxj.myrouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.zxj.base.TestService;
import com.zxj.myrouter.parcelable.TestParcelable;
import com.zxj.router.annotation.Extra;
import com.zxj.router.annotation.Route;
import com.zxj.router.core.MyRouter;
import com.zxj.router.core.template.IService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Route(path = "/main/test")
public class SecondActivity extends AppCompatActivity {

    @Extra
    String a;
    @Extra
    int b;
    @Extra
    short c;
    @Extra
    long d;
    @Extra
    float e;
    @Extra
    double f;
    @Extra
    byte g;
    @Extra
    boolean h;
    @Extra
    char i;

    @Extra
    String[] aa;
    @Extra
    int[] bb;
    @Extra
    short[] cc;
    @Extra
    long[] dd;
    @Extra
    float[] ee;
    @Extra
    double[] ff;
    @Extra
    byte[] gg;
    @Extra
    boolean[] hh;
    @Extra
    char[] ii;

    @Extra
    TestParcelable j;
    @Extra
    TestParcelable[] jj;


    @Extra
    List<TestParcelable> k1;
    @Extra
    ArrayList<TestParcelable> k2;

    @Extra
    List<String> k3;

    @Extra
    List<Integer> k4;

    @Extra(name = "hhhhhh")
    int test;

    @Extra(name = "/main/service1")
    TestService testService1;
    @Extra(name = "/main/service2")
    TestService testService2;
    @Extra(name = "/module1/service")
    TestService testService3;
    @Extra(name = "/module2/service")
    TestService testService4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MyRouter.getInstance().inject(this);
        Log.e("Second", toString());

        testService1.test();
        testService2.test();
        testService3.test();
        testService4.test();
    }

    @Override
    public void onBackPressed() {
        setResult(200);
        super.onBackPressed();
    }

    @Override
    public String toString() {
        return "SecondActivity{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                ", g=" + g +
                ", h=" + h +
                ", i=" + i +
                ", aa=" + Arrays.toString(aa) +
                ", bb=" + Arrays.toString(bb) +
                ", cc=" + Arrays.toString(cc) +
                ", dd=" + Arrays.toString(dd) +
                ", ee=" + Arrays.toString(ee) +
                ", ff=" + Arrays.toString(ff) +
                ", gg=" + Arrays.toString(gg) +
                ", hh=" + Arrays.toString(hh) +
                ", ii=" + Arrays.toString(ii) +
                ", j=" + j +
                ", jj=" + Arrays.toString(jj) +
                ", k1=" + k1 +
                ", k2=" + k2 +
                ", k3=" + k3 +
                ", k4=" + k4 +
                ", test=" + test +
                ", testService1=" + testService1 +
                ", testService2=" + testService2 +
                ", testService3=" + testService3 +
                ", testService4=" + testService4 +
                '}';
    }
}
