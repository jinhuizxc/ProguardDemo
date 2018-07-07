package com.example.jh.proguarddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * proguard代码混淆、打包
 *
 * Proguard是一个混淆代码的开源项目，主要是混淆，还能对字节码进行缩减体积、优化等。
 *
 * 官网网址：http://proguard.sourceforge.net/
 *
 * Proguard基本语法：
 * 保留类名
 * 保留方法名
 * 保留类名和方法名
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
