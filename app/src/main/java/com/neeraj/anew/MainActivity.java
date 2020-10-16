package com.neeraj.anew;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.neeraj.anew.helper.ImageViewHelperCorner;
import com.neeraj.anew.volley.VolleyRequest;
import com.neeraj.anew.volley.VolleyRequestListener;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class MainActivity extends AppCompatActivity {
    SliderLayout sliderLayout;
    EditText ed1;
    ImageView iv1,iv2,iv3,iv4;
    TextView tv1,tv2,tv3,tv4;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderLayout=findViewById(R.id.imageSlider);
        ed1=findViewById(R.id.edittext);
        iv1=findViewById(R.id.imageView2);
        iv2=findViewById(R.id.imageView3);
        tv1=findViewById(R.id.textviewtravel);
        tv2=findViewById(R.id.textviewsim);
        tv3=findViewById(R.id.textview_payment);
        tv4=findViewById(R.id.textview_devices);
        Bitmap bitmap= ImageViewHelperCorner.imageFromDrawable(MainActivity.this,R.drawable.airtelhomescreen);
        Bitmap bitmap1= ImageViewHelperCorner.imageFromDrawable(MainActivity.this,R.drawable.phoonehomescreen);
        iv1.setImageBitmap(bitmap);
        iv2.setImageBitmap(bitmap1);
        iv3=findViewById(R.id.imageView4);
        iv4=findViewById(R.id.imageView5);
        iv3.setImageBitmap(bitmap);
        iv4.setImageBitmap(bitmap1);
        ed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText("");
            }
        });
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(2);
        setSliderViews();
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,travel_Insurance.class);
                startActivity(i);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,International_Sim.class);
                startActivity(i);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,bill_payment.class);
                startActivity(i);
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Smartphone_devices.class);
                startActivity(i);
            }
        });
    }
    private void setSliderViews(){
        for (int i=0;i<=4;i++){

            DefaultSliderView sliderView=new DefaultSliderView(this);

            switch (i){
                case 0:
                    sliderView.setImageDrawable(R.drawable.is);
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.is2);
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.is);
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.is2);
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.is);
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderView.setDescription((i+1)+"/5");
            sliderLayout.addSliderView(sliderView);
        }
    }
}
