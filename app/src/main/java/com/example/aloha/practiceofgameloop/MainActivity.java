package com.example.aloha.practiceofgameloop;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i=0;
    int j=0;
    TextView textView;
    Handler handler=new Handler();
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            i++;
            textView.setText(""+i);
            handler.postDelayed(runnable,500);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        handler.post(runnable);
    }

    public void ButtonOnClick(View view) {
        TextView textView2=(TextView)findViewById(R.id.textView2);
        j++;
        textView2.setText(""+j);
    }

    public void Button2OnClick(View view) {
        handler.removeCallbacks(runnable);
    }

}

