package com.example.love;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 点击开始
     */
    private Button btn_Kaishi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_Kaishi = (Button) findViewById(R.id.btn_kaishi);
        btn_Kaishi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn_kaishi:
                Intent intent = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
