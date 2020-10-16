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
import android.widget.ImageView;
import android.widget.TextView;

import com.neeraj.anew.helper.ImageViewHelperCorner;

public class bill_payment extends AppCompatActivity {
    TextView t1;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6;
    CardView c1,c2,c3,c4;
    Button b2;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_payment);
        c1=findViewById(R.id.bill_cv1);
        c2=findViewById(R.id.bill_cv2);
        c3=findViewById(R.id.bill_cv3);
        c4=findViewById(R.id.bill_cv4);
        iv1=findViewById(R.id.imageView2);
        iv2=findViewById(R.id.imageView3);
        iv3=findViewById(R.id.imageView4);
        iv4=findViewById(R.id.imageView5);
        iv5=findViewById(R.id.imageView8);
        iv6=findViewById(R.id.imageView7);
        t1=findViewById(R.id.textView16);
        b2=findViewById(R.id.button17);
        Bitmap bitmap= ImageViewHelperCorner.imageFromDrawable(bill_payment.this,R.drawable.airtelhomescreen);
        Bitmap bitmap1= ImageViewHelperCorner.imageFromDrawable(bill_payment.this,R.drawable.phoonehomescreen);
        iv1.setImageBitmap(bitmap);
        iv2.setImageBitmap(bitmap1);
        iv3.setImageBitmap(bitmap);
        iv4.setImageBitmap(bitmap1);
        iv5.setImageBitmap(bitmap);
        iv6.setImageBitmap(bitmap1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bill_payment.super.onBackPressed();
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment.this,bill_payment_mobile.class);
                startActivity(i);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment.this,bill_payment_dth.class);
                startActivity(i);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment.this,bill_payment_water.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment.this,bill_payment_previous.class);
                startActivity(i);
            }
        });
    }
}