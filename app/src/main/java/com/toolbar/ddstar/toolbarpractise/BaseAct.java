package com.toolbar.ddstar.toolbarpractise;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

/**
 * Created by DDstar on 2016/5/27.
 */
public abstract class BaseAct extends AppCompatActivity {
    protected <E extends View> E $(int res) {
        return (E) findViewById(res);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayoutRes());
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    abstract public int getLayoutRes();
}
