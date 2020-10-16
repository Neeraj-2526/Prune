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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class select_country extends AppCompatActivity {
        ListView l;
        String content[] = {"INDIA","DUBAI","AUSTRALIA","FRANCE","MALAYSIA","JAPAN","MALDIVES","INDIA","INDIA","DUBAI","AUSTRALIA","FRANCE","MALAYSIA","JAPAN","MALDIVES","INDIA"};
        int images[] = {R.drawable.india, R.drawable.dubai, R.drawable.australia, R.drawable.france, R.drawable.is2, R.drawable.japan, R.drawable.is2, R.drawable.india,R.drawable.india,R.drawable.dubai,R.drawable.australia,R.drawable.france,R.drawable.is2,R.drawable.japan,R.drawable.is2,R.drawable.india};


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_select_country);
            l=findViewById(R.id.listview_country);

            Myadapter myadapter=new Myadapter(this,content,images);
            l.setAdapter(myadapter);
        }
    class Myadapter extends ArrayAdapter<String> {

        Context context;
        String content1[];
        int images1[];

        Myadapter(Context c, String title[],int img[]){
            super(c,R.layout.row1,R.id.textView189,title);
            this.context=c;
            this.content1=title;
            this.images1=img;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row1=layoutInflater.inflate(R.layout.row1,parent,false);
            ImageView images=row1.findViewById(R.id.imageView45);
            TextView mynews=row1.findViewById(R.id.textView189);

            images.setImageResource(images1[position]);
            mynews.setText(content1[position]);

            return row1;
        }
    }
    }
