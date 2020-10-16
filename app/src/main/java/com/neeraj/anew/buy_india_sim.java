package com.neeraj.anew;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.neeraj.anew.helper.ImageViewHelperCorner;

public class buy_india_sim extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner;
    TextView t1;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_india_sim);
        spinner=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.paid,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        iv1=findViewById(R.id.imageView2);
        iv2=findViewById(R.id.imageView3);
        iv3=findViewById(R.id.imageView4);
        iv4=findViewById(R.id.imageView5);
        iv5=findViewById(R.id.imageView6);
        iv6=findViewById(R.id.imageView7);
        t1=findViewById(R.id.textView16);
        Bitmap bitmap= ImageViewHelperCorner.imageFromDrawable(buy_india_sim.this,R.drawable.airtelhomescreen);
        Bitmap bitmap1= ImageViewHelperCorner.imageFromDrawable(buy_india_sim.this,R.drawable.phoonehomescreen);
        iv1.setImageBitmap(bitmap);
        iv2.setImageBitmap(bitmap1);
        iv3.setImageBitmap(bitmap);
        iv4.setImageBitmap(bitmap1);
        iv5.setImageBitmap(bitmap);
        iv6.setImageBitmap(bitmap1);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy_india_sim.super.onBackPressed();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}