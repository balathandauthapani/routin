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
    ImageView iv;
    RadioGroup rbg;
    RadioButton rb1;
    RadioButton rb2;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        iv =(ImageView)findViewById(R.id.imageView2);
         b4 = (Button)findViewById(R.id.b4);
        rbg = (RadioGroup)findViewById(R.id.rbg);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(Main4Activity.this,chooselocality.class);
                startActivity(i3);
            }
        });
        rb1.setSelected(true);
        rbg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (rb1.isChecked()) {
                    iv.setImageResource(R.mipmap.male);
                }
                else
                {
                    iv.setImageResource(R.mipmap.women);}
            }
        });

    }
}
