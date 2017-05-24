package com.example.myfirstprogram.acivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.example.myfirstprogram.R;
import com.example.myfirstprogram.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onWindowFocusChanged(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast(getMobileWidth()+getMobileHeight()+getStatusBarHeight()+"__"+checkNetworkState());
    }



    @Override
    protected void loadViewLayout() {


    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void processLogic() {

    }

    @Override
    protected Context getActivityContext() {
        return null;
    }

    @Override
    public void onClick(View v) {

    }
}
