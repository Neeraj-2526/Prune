package com.neeraj.anew;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.*;

public class Checkout extends AppCompatActivity {
    ListView l;
    List<String>name=new ArrayList<>();
    List<String>age=new ArrayList<>();
    List<String>sex=new ArrayList<>();
    List<String>email=new ArrayList<>();
    List<String>mobile=new ArrayList<>();
    List<String>address=new ArrayList<>();

    public int i=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        l=findViewById(R.id.listview_checkout);
        for(int j=0;j<i;j++){
            name.add("Full Name");
            age.add("Age");
            sex.add("Sex");
            email.add("Email ID");
            mobile.add("Mobile No");
            address.add("Address/Building No./Ward");
        }
        Myadapter myadapter=new Myadapter(this,name,age,sex,email,mobile,address);
        l.setAdapter(myadapter);
    }
    class Myadapter extends ArrayAdapter<String> {

        Context context;
        String name1[];
        String age1[];
        String sex1[];
        String email1[];
        String mobile1[];
        String address1[];

        Myadapter(Context c, List<String> nm, List<String> ag, List<String> se, List<String> em, List<String> mo, List<String> ad){
            super(c,R.layout.checkout_box,R.id.text_name,nm);

            this.context=c;
            this.name1= nm.toArray(new String[0]);
            this.age1= ag.toArray(new String[0]);
            this.sex1= se.toArray(new String[0]);
            this.email1= em.toArray(new String[0]);
            this.mobile1= mo.toArray(new String[0]);
            this.address1= ad.toArray(new String[0]);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row1=layoutInflater.inflate(R.layout.checkout_box,parent,false);

            EditText fullname=row1.findViewById(R.id.text_name);
            EditText fullage=row1.findViewById(R.id.text_age);
            EditText fullsex=row1.findViewById(R.id.text_sex);
            EditText fullemail=row1.findViewById(R.id.text_email);
            EditText fullmobile=row1.findViewById(R.id.text_mobile);
            EditText fulladdress=row1.findViewById(R.id.text_address);

            fullname.setHint(name1[position]);
            fullage.setHint(age1[position]);
            fullsex.setHint(sex1[position]);
            fullemail.setHint(email1[position]);
            fullmobile.setHint(mobile1[position]);
            fulladdress.setHint(address1[position]);

            return row1;
        }
    }
}