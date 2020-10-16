package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bill_payment_mobile extends AppCompatActivity {
    Button b1;
    CardView c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_payment_mobile);
        b1=findViewById(R.id.button19);
        c2=findViewById(R.id.bill_cv2);
        c3=findViewById(R.id.bill_cv3);
        c4=findViewById(R.id.bill_cv4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_mobile.this,bill_payment_newnumber1.class);
                startActivity(i);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_mobile.this,bill_payment_dth.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_mobile.this,bill_payment_water.class);
                startActivity(i);
            }
        });

    }
}