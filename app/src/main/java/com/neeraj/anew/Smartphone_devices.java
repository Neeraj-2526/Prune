package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Smartphone_devices extends AppCompatActivity {
    TextView b1;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    ImageView im;
    Button b6,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartphone_devices);
        im=findViewById(R.id.imageView35);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Smartphone_devices.this,filter.class);
                startActivity(i);
            }
        });
        b1=findViewById(R.id.button23);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Smartphone_devices.this,smartphone_devices_solution.class);
                startActivity(i);
            }
        });
        t1=findViewById(R.id.textView115);
        t2=findViewById(R.id.textView116);
        t3=findViewById(R.id.textView215);
        t4=findViewById(R.id.textView216);
        t5=findViewById(R.id.textView315);
        t6=findViewById(R.id.textView316);
        t7=findViewById(R.id.textView415);
        t8=findViewById(R.id.textView416);
        t9=findViewById(R.id.textView515);
        t10=findViewById(R.id.textView516);
        t1.setPaintFlags(t1.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t2.setPaintFlags(t2.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t3.setPaintFlags(t3.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t4.setPaintFlags(t4.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t5.setPaintFlags(t5.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t6.setPaintFlags(t6.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t7.setPaintFlags(t7.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t8.setPaintFlags(t8.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t9.setPaintFlags(t9.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        t10.setPaintFlags(t10.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        b2=findViewById(R.id.button24);
        b3=findViewById(R.id.button25);
        b4=findViewById(R.id.button26);
        b5=findViewById(R.id.button27);
        b6=findViewById(R.id.button28);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Smartphone_devices.this,compare_smartphone.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Smartphone_devices.this,compare_smartphone.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Smartphone_devices.this,compare_smartphone.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Smartphone_devices.this,compare_smartphone.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Smartphone_devices.this,compare_smartphone.class);
                startActivity(i);
            }
        });
    }
}