package com.pinger.customtoastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.pinger.customtoastdemo.utils.CustomToastUtil;

/**
 * 点击按钮，弹出和隐藏自定义吐司
 */
public class MainActivity extends AppCompatActivity {

    private CustomToastUtil mToastUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToastUtil = new CustomToastUtil(this);

       //  Toast.makeText(this, "下载失败", Toast.LENGTH_SHORT).show();
    }

    /**
     * 弹吐司
     *
     * @param view
     */
    public void popToast(View view) {
        mToastUtil.popToast("下载成功");
    }

    /**
     * 隐藏吐司
     *
     * @param view
     */
    public void hideToast(View view) {
        mToastUtil.hideToast();
    }
}
