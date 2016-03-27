package com.ewill.actuallaws;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends Activity {
    private Toolbar _toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
    }

    private void initToolbar(){
        _toolbar = (Toolbar) findViewById(R.id.toolbar);
        _toolbar.setTitle(R.string.app_name);
        _toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        _toolbar.inflateMenu(R.menu.menu);

    }
}
