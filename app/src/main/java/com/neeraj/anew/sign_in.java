package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class sign_in extends AppCompatActivity {
    TextView t,t1;
    float x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        t=findViewById(R.id.textView200);
        t1=findViewById(R.id.textView4);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(sign_in.this,sign_up.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_to_right,R.anim.slide_out_left);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(sign_in.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1=event.getX();
                y1=event.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2=event.getX();
                y2=event.getY();
                if (x1>x2){
                    Intent i=new Intent(sign_in.this,sign_up.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_to_right,R.anim.slide_out_left);
                }
                break;
        }
        return false;
    }
}