package com.toolbar.ddstar.toolbarpractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        go2ToolBar();
    }

    public void go2ToolBar(View v) {
        startActivity(new Intent(this,ToolBarAct.class));
    }
}
