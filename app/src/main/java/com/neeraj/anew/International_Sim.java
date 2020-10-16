package com.neeraj.anew;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.neeraj.anew.helper.ImageViewHelperCorner;

public class International_Sim extends AppCompatActivity {
    Button b1;
    ImageView iv1,iv2,iv3;
    TextView t1;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international__sim);
        b1=findViewById(R.id.button17);
        t1=findViewById(R.id.textView16);
        iv1=findViewById(R.id.imageView2);
        iv2=findViewById(R.id.imageView3);
        iv3=findViewById(R.id.iv_india);
        Bitmap bitmap= ImageViewHelperCorner.imageFromDrawable(International_Sim.this,R.drawable.airtelhomescreen);
        Bitmap bitmap1= ImageViewHelperCorner.imageFromDrawable(International_Sim.this,R.drawable.phoonehomescreen);
        iv1.setImageBitmap(bitmap);
        iv2.setImageBitmap(bitmap1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                International_Sim.super.onBackPressed();
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(International_Sim.this,buy_india_sim.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(International_Sim.this,Mycart.class);
                startActivity(i);
            }
        });
    }
}