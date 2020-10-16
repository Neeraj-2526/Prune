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

import com.neeraj.anew.helper.ImageViewHelperCorner;

public class bill_payment_water extends AppCompatActivity {
    ImageView iv1,iv2,iv3,iv4;
    Button b1;
    CardView c1,c2,c4;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_payment_water);
        iv1=findViewById(R.id.imageView2);
        iv2=findViewById(R.id.imageView3);
        iv3=findViewById(R.id.imageView4);
        iv4=findViewById(R.id.imageView5);
        Bitmap bitmap= ImageViewHelperCorner.imageFromDrawable(bill_payment_water.this,R.drawable.airtelhomescreen);
        Bitmap bitmap1= ImageViewHelperCorner.imageFromDrawable(bill_payment_water.this,R.drawable.phoonehomescreen);
        iv1.setImageBitmap(bitmap);
        iv2.setImageBitmap(bitmap1);
        iv3.setImageBitmap(bitmap);
        iv4.setImageBitmap(bitmap1);
        b1=findViewById(R.id.button19);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_water.this,payment_method.class);
                startActivity(i);
            }
        });
        c1=findViewById(R.id.bill_cv1);
        c2=findViewById(R.id.bill_cv2);
        c4=findViewById(R.id.bill_cv4);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_water.this,bill_payment_mobile.class);
                startActivity(i);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(bill_payment_water.this,bill_payment_dth.class);
                startActivity(i);
            }
        });
    }
}