package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ImageView iv = (ImageView)findViewById(R.id.imageView);
        RadioGroup rbg = (RadioGroup)findViewById(R.id.rbg);
        RadioButton rb1 = (RadioButton)findViewById(R.id.rb1);
        RadioButton rb2 = (RadioButton)findViewById(R.id.rb2);
        Button b4= (Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               Intent i3=new Intent(getBaseContext(),chooselocality.class);
               startActivity(i3);
           }
        });
    }
}