package com.kyuwankim.javawidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    TextView tv_1;
    TextView tv_2;
    TextView tv_3;
    TextView tv_4;
    TextView tv_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_4 = (TextView) findViewById(R.id.tv_4);
        tv_5 = (TextView) findViewById(R.id.tv_5);

        Intent intent = getIntent();
        ArrayList<String> datas = (ArrayList<String>) intent.getExtras().get("key");

        tv_1.setText(datas.get(0));
        tv_2.setText(datas.get(1));
        tv_3.setText(datas.get(2));
        tv_4.setText(datas.get(3));
        tv_5.setText(datas.get(4));


    }
}
