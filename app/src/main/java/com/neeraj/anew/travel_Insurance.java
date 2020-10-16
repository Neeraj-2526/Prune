package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class travel_Insurance extends AppCompatActivity {
    RadioGroup rg1;
    Button btn;
    RadioButton rb;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel__insurance);
        rg1=findViewById(R.id.radioGroup);
        btn=findViewById(R.id.button10);
        t1=findViewById(R.id.textView16);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                travel_Insurance.super.onBackPressed();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioid=rg1.getCheckedRadioButtonId();
                rb=findViewById(radioid);
                String t=rb.getText().toString();
                if(t.equals("Single Trip")){
                    Intent i1=new Intent(travel_Insurance.this,singletrip.class);
                    startActivity(i1);
                }
            }
        });

    }
}