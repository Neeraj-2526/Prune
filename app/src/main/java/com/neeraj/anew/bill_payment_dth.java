package com.neeraj.anew;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.neeraj.anew.helper.ImageViewHelperCorner;

public class bill_payment_dth extends AppCompatActivity {
    ImageView iv1,iv2,iv3,iv4;
    Button b1;
    ImageView i1,i2,i3,i4,i5,i6;
    TextView t1;
    EditText e1;
    CardView c1,c3,c4;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_payment_dth);
        iv1=findViewById(R.id.imageView2);
        iv2=findViewById(R.id.imageView3);
        iv3=findViewById(R.id.imageView4);
        iv4=findViewById(R.id.imageView5);
        b1=findViewById(R.id.button19);
        i1=findViewById(R.id.imageView20);
        i2=findViewById(R.id.imageView21);
        i3=findViewById(R.id.imageView22);
        i4=findViewById(R.id.imageView23);
        i5=findViewById(R.id.imageView24);
        i6=findViewById(R.id.imageView25);
        t1=findViewById(R.id.textView97);
        e1=findViewById(R.id.dth_select_operator);
        Bitmap bitmap= ImageViewHelperCorner.imageFromDrawable(bill_payment_dth.this,R.drawable.airtelhomescreen);
        Bitmap bitmap1= ImageViewHelperCorner.imageFromDrawable(bill_payment_dth.this,R.drawable.phoonehomescreen);
        iv1.setImageBitmap(bitmap);
        iv2.setImageBitmap(bitmap1);
        iv3.setImageBitmap(bitmap);
        iv4.setImageBitmap(bitmap1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_dth.this,bill_payment_dth_proceed.class);
                startActivity(i);
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundResource(R.drawable.tatasky);
                e1.setText("Tata Sky");
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundResource(R.drawable.dishtv);
                e1.setText("DishTV");
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundResource(R.drawable.d2h);
                e1.setText("Videocon D2H");
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundResource(R.drawable.tatasky);
                e1.setText("Tata Sky");
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundResource(R.drawable.hinda);
                e1.setText("Hinda-Delhi NCR");
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setBackgroundResource(R.drawable.d2h);
                e1.setText("Videocon D2H");
            }
        });
        c1=findViewById(R.id.bill_cv1);
        c3=findViewById(R.id.bill_cv3);
        c4=findViewById(R.id.bill_cv4);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_dth.this,bill_payment_mobile.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_dth.this,bill_payment_water.class);
                startActivity(i);
            }
        });
    }
}