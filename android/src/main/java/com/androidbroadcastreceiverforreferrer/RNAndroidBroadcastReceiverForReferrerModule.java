package com.androidbroadcastreceiverforreferrer;

import android.util.Log;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNAndroidBroadcastReceiverForReferrerModule extends ReactContextBaseJavaModule {

    public static ReactApplicationContext reactContext;

    public RNAndroidBroadcastReceiverForReferrerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAndroidBroadcastReceiverForReferrer";
    }

    @ReactMethod
    public void getReferrerData(Promise promise) {
        Log.d("ReactNativeJS", "Inside getReferrerData in RNAndroidBroadcastReceiverForReferrerModule");

        String referrerValue = "NOT AVAILABLE";

        if (ReferrerBroadcastReceiver.referrer != null) {
            Log.d("ReactNativeJS", "ReferrerBroadcastReceiver.referrer is not null. It is:" + ReferrerBroadcastReceiver.referrer);
            referrerValue = ReferrerBroadcastReceiver.referrer;
        }

        Log.d("ReactNativeJS", "Returning from getReferrerData in RNAndroidBroadcastReceiverForReferrerModule. referrer is:" + referrerValue);
        promise.resolve(referrerValue);
    }
}