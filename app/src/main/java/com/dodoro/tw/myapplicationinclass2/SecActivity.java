package com.dodoro.tw.myapplicationinclass2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent it = getIntent();
        String str = it.getStringExtra(Intent.EXTRA_TEXT);
        TextView tv1 =(TextView)findViewById(R.id.textView);
        tv1.setText(str);
    }
}
