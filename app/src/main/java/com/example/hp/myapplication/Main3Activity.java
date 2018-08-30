package com.example.hp.myapplication;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
     Button b2;
     EditText e2;
     TextView t7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b2 = (Button)findViewById(R.id.b2);
        e2 = (EditText)findViewById(R.id.e2);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i2 = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i2);

              }
        });
        t7=(TextView)findViewById(R.id.t7);
        new CountDownTimer(10000,1000){
            public void onTick(long millisUntilFinished){
                t7.setText("seconds remaining:"+millisUntilFinished/1000);
            }
            public void onFinish(){
                t7.setText("Time Up..\nTry Again");
            }
        }.start();
    }
}
