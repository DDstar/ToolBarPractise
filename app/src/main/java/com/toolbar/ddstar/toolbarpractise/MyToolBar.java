package com.toolbar.ddstar.toolbarpractise;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MyToolBar extends BaseAct {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getLayoutRes());
        Toolbar toolBar = $(R.id.toolBarMine);
        toolBar.inflateMenu(R.menu.base_toolbar_menu);
        toolBar.setNavigationIcon(R.mipmap.icon_menu);
        toolBar.setTitle("更多");
        toolBar.setSubtitle("点击查看");

//        toolBar.setLogo();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_my_tool_bar;
    }
}
