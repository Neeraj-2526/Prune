package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bill_payment_dth_proceed extends AppCompatActivity {
    CardView c1,c3,c4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_payment_dth_proceed);
        b1=findViewById(R.id.button20);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_dth_proceed.this,payment_method.class);
                startActivity(i);
            }
        });
        c1=findViewById(R.id.bill_cv1);
        c3=findViewById(R.id.bill_cv3);
        c4=findViewById(R.id.bill_cv4);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_dth_proceed.this,bill_payment_mobile.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_dth_proceed.this,bill_payment_water.class);
                startActivity(i);
            }
        });
    }
}