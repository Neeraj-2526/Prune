package com.neeraj.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class singletripsubpart extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletripsubpart);
        spinner=findViewById(R.id.spinner);
        t1=findViewById(R.id.textView16);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.sort,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                singletripsubpart.super.onBackPressed();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text=adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}