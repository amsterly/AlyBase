package com.flj.latte.ec.pay;

/**
 * Created by fashionaly
 */

public interface IAlPayResultListener {

    void onPaySuccess();

    void onPaying();

    void onPayFail();

    void onPayCancel();

    void onPayConnectError();
}
