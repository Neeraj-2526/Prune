package com.neeraj.anew;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class singletrip extends AppCompatActivity {
    static EditText ed1,ed2,ed3;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singletrip);
        ed1=findViewById(R.id.editTextDate);
        ed2=findViewById(R.id.editTextDate2);
        ed3=findViewById(R.id.editTextDate3);
        t1=findViewById(R.id.textView16);
        b1=findViewById(R.id.button11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(singletrip.this,singletripsubpart.class);
                startActivity(i1);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                singletrip.super.onBackPressed();
            }
        });
        ed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment fragment4=new DatePickerFragment();
                fragment4.show(getSupportFragmentManager(),"Date Picker1");
            }
        });
        ed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                DialogFragment fragment5=new DatePickerFragment1();
                fragment5.show(getSupportFragmentManager(),"Date Picker2");
            }
        });
        ed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                DialogFragment fragment3=new DatePickerFragment2();
                fragment3.show(getSupportFragmentManager(),"Date Picker3");
            }
        });
    }
    public static class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog( Bundle savedInstanceState) {
            final Calendar c=Calendar.getInstance();
            int year=c.get(Calendar.YEAR);
            int month=c.get(Calendar.MONTH);
            int day=c.get(Calendar.DAY_OF_MONTH);
            return new DatePickerDialog(getActivity(),R.style.Date,this,year,month,day);
        }
        public void onDateSet(DatePicker view, int year, int month, int day) {
            Calendar c=Calendar.getInstance();
            c.set(Calendar.YEAR,year);
            c.set(Calendar.MONTH,month);
            c.set(Calendar.DAY_OF_MONTH,day);
            String currentdateString= DateFormat.getDateInstance().format(c.getTime());
            ed1.setText(currentdateString);
        }

    }

    public static class DatePickerFragment1 extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            Calendar c=Calendar.getInstance();
            int year=c.get(Calendar.YEAR);
            int month=c.get(Calendar.MONTH);
            int day=c.get(Calendar.DAY_OF_MONTH);
            return new DatePickerDialog(getActivity(),R.style.Date,this,year,month,day);
        }
        public void onDateSet(DatePicker view1, int year, int month, int day) {
            Calendar c=Calendar.getInstance();
            c.set(Calendar.YEAR,year);
            c.set(Calendar.MONTH,month);
            c.set(Calendar.DAY_OF_MONTH,day);
            String currentdateString= DateFormat.getDateInstance().format(c.getTime());
            ed2.setText(currentdateString);
        }

    }
    public static class DatePickerFragment2 extends DialogFragment implements DatePickerDialog.OnDateSetListener {
        @NonNull
        @Override
        public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
            Calendar c=Calendar.getInstance();
            int year=c.get(Calendar.YEAR);
            int month=c.get(Calendar.MONTH);
            int day=c.get(Calendar.DAY_OF_MONTH);
            return new DatePickerDialog(getActivity(),R.style.Date,this,year,month,day);
        }

        public void onDateSet(DatePicker view2, int i, int i1, int i2) {
            Calendar c=Calendar.getInstance();
            c.set(Calendar.YEAR,i);
            c.set(Calendar.MONTH,i1);
            c.set(Calendar.DAY_OF_MONTH,i2);
            String currentdateString= DateFormat.getDateInstance().format(c.getTime());
            ed3.setText(currentdateString);
        }

    }

}