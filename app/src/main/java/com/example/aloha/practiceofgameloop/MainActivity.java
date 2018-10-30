package com.example.aloha.practiceofgameloop;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i=0;
    TextView textView;
    Handler handler=new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            i++;
            textView.setText(""+i);
            handler.postDelayed(runnable,1000);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
    }

    public void ButtonOnClick(View view) {
        handler.post(runnable);
    }

    public void Button2OnClick(View view) {
        handler.removeCallbacks(runnable);
    }

}

