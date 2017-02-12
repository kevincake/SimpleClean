package com.ifreedomer.simpleclean.activity;

import android.os.Bundle;

import com.ifreedomer.simpleclean.R;
import com.ifreedomer.simpleclean.present.MainPresent;

public class MainActivity extends BaseActivity  {
    private MainPresent mainPresent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresent = new MainPresent();
        mainPresent.initLogic();
    }




}
