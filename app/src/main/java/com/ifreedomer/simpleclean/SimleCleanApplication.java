package com.ifreedomer.simpleclean;

import android.app.Application;

/**
 * @author:eavawu
 * @date: 11/02/2017.
 * @todo:
 */

public class SimleCleanApplication extends Application {
    private static SimleCleanApplication instance = null;


    public static SimleCleanApplication getInstance() {

        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
