package com.heloworld;

import andorid.os.Bundle;
import andorid.support.v7.app.AppCompactActivity;

public class HelloWorld extends AppCompactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_activity);
    }
}
