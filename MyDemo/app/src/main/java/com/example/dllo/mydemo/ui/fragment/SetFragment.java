package com.example.dllo.mydemo.ui.fragment;

import android.widget.TextView;
import android.widget.Toast;

import com.example.dllo.mydemo.R;
import com.example.dllo.mydemo.ui.activity.MainActivity;

/**
 * Created by dllo on 16/7/11.
 */
/*
   创建Fragment使用基类
 */
public class SetFragment extends AbsBaseFragment{
    private TextView tv;
    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
      tv =byView(R.id.tv_main);
        Toast.makeText(context, "----", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void initDatas() {
          goTo(context , MainActivity.class);
    }
}
