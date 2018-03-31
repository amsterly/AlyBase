package com.example.aly.alybasesupport;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;

import com.flj.latte.delegates.web.event.Event;

/**
 * Created by wangxiantao on 2018/3/31.
 */

class TestEvent extends Event {
    @Override
    public String execute(String params) {
        Toast.makeText(getContext(),params,Toast.LENGTH_SHORT).show();
        if(getAction().equals("test"))
        {
            final WebView webView=getWebView();
            webView.post(new Runnable() {
                @Override
                public void run() {
                    webView.evaluateJavascript("nativeCall('我传参数啦！')", new ValueCallback<String>() {
                        @Override
                        public void onReceiveValue(String s) {
                            Toast.makeText(getContext(),s,Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            });
        }
        return "";
    }
}
