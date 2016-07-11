package com.example.dllo.mydemo.tools;

import android.util.Log;

/**
 * Created by dllo on 16/7/11.
 */
//被final不能被继承
//私有构造方法 ,外部不能创建对象
public final class L {
    //私有的构造方法
    private L() {

    }

    //调试模式 目前定义为true
    private static boolean isDeBug = true;
    //log的标签,定义的是应用名
    private static String TAG = "MyDemo";

    public static void e(String msg) {
        if (isDeBug) {
            Log.e(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (isDeBug) {
            Log.d(TAG, msg);
        }
    }

    /**
     * 使用自定义TAG标签的
     *
     * @param tag
     * @param msg
     */
    public static void e(String tag, String msg) {
        if (isDeBug) {
            Log.e(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (isDeBug) {
            Log.d(tag, msg);
        }
    }
}
