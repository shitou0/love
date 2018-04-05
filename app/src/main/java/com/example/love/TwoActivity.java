package com.example.love;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {
    Handler handler = new Handler();
    private TextView time;
    int shijian = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
 time = (TextView) findViewById(R.id.tv);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                time.setText(""+shijian);
                shijian--;
                if (shijian == 0) {
                    Intent intent = new Intent(TwoActivity.this,ThreeActivity.class);
                    startActivity(intent);
                    finish();
                }
                handler.postDelayed(this,1000);
            }
        }, 1000);
    }
}
