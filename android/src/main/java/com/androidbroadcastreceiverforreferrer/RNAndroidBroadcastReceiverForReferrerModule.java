package com.androidbroadcastreceiverforreferrer;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNAndroidBroadcastReceiverForReferrerModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNAndroidBroadcastReceiverForReferrerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNAndroidBroadcastReceiverForReferrer";
    }


}