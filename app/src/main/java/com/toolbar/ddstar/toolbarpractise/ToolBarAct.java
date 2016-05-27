package com.toolbar.ddstar.toolbarpractise;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ToolBarAct extends BaseAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.activity_tool_bar);
        setContentView(getLayoutRes());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setNavigationIcon(R.mipmap.voice);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setTitle("title");
        toolbar.setSubtitle("subTitle");
        toolbar.inflateMenu(R.menu.base_toolbar_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ToolBarAct.this, "点到图标了", Toast.LENGTH_LONG).show();
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_tool_bar;
    }
}
