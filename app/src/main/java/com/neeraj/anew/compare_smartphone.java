package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class compare_smartphone extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_smartphone);
        t1=findViewById(R.id.textView154);
        t1.setPaintFlags(t1.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }
}