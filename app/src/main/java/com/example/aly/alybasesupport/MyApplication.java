package com.example.aly.alybasesupport;

import android.support.multidex.MultiDexApplication;

import com.flj.latte.app.Latte;
import com.flj.latte.ec.icon.FontEcModule;
import com.flj.latte.net.interceptors.DebugInterceptor;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by wangxiantao on 2018/3/31.
 */

public class MyApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withInterceptor(new DebugInterceptor("test",R.raw.test))
                .withApiHost("http://192.168.0.1:8080/RestServer/api/")
                .withWebEvent("test",new TestEvent())
                .withJavascriptInterface("latte")
                .configure();
    }
}
