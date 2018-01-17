package com.kyuwankim.javawidget;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    // TextView 선언
    TextView tv_left;
    TextView tv_right;
    ArrayList<String> datas = new ArrayList<>();

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setListener();


    }

    private void setListener() {
        // TextView Listener 셋팅
        tv_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datas.remove(1);
                tv_right.setText(datas.get(1));
            }
        });
        tv_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datas.remove(0);
                tv_left.setText(datas.get(1));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("key", datas);
                startActivity(intent);
            }
        });
    }

    private void init() {
        datas.add("아메리카노");
        datas.add("카페라떼");
        datas.add("아포카토");
        datas.add("카페모카");
        datas.add("콜드브루");

        // TextView 바인딩
        tv_left = (TextView) findViewById(R.id.tv_left);
        tv_right = (TextView) findViewById(R.id.tv_right);
        btn = (Button) findViewById(R.id.button);

        // TextView 에 글자 셋팅
        tv_left.setText(datas.get(0));
        tv_right.setText(datas.get(1));
    }
}
