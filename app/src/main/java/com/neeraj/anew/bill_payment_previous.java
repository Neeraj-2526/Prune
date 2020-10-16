package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bill_payment_previous extends AppCompatActivity {
    CardView c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_payment_previous);
        c2=findViewById(R.id.bill_cv2);
        c3=findViewById(R.id.bill_cv3);
        c4=findViewById(R.id.bill_cv4);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_previous.this,bill_payment_mobile.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_previous.this,bill_payment_water.class);
                startActivity(i);
            }
        });
    }
}