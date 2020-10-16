package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import org.florescu.android.rangeseekbar.RangeSeekBar;

public class filter extends AppCompatActivity {
    RangeSeekBar s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        s=findViewById(R.id.seekBar);
    }
}