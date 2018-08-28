package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    Button b2;
    EditText e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b2 = (Button)findViewById(R.id.b2);
        e2 = (EditText)findViewById(R.id.e2);
        b2.setOnClickListener(new View.OnClickListener() -
            @Override
            public void onClick(new View()) {
                Intent i2 = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(i2);
            }
        });
    }
}
