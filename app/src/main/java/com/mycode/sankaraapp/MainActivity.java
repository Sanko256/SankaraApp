package com.mycode.sankaraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText t1 = (EditText)findViewById(R.id.nameInput);
        final EditText t2 = (EditText)findViewById(R.id.address);
        final TextView tx1 = (TextView)findViewById(R.id.outDisplay);
        Button but = (Button)findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= t1.getText().toString();
                String add = t2.getText().toString();
                String display = name+""+"This is my address"+add;
                tx1.setText(display);
            }
        });
    }
}
