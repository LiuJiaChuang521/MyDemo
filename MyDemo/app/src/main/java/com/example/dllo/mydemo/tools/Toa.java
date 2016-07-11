package com.example.dllo.mydemo.tools;

import android.widget.Toast;

import com.example.dllo.mydemo.ui.activity.MyApp;

/**
 * Created by dllo on 16/7/11.
 * toast吐司的工具类
 */
public class Toa {
    private static boolean isDebug = true;

    /**
     * 吐司长时间的
     * @param msg
     */
    public static void longMsg(String msg){
        if (isDebug){
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
    public static void shortMsg(String msg){
        if (isDebug){
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
}
