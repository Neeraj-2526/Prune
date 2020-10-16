package com.neeraj.anew;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class review extends AppCompatActivity {
    ListView l;
    String content[]={"PUBG Mobile 0.18.0 Update Reportedly Releasing on April 224 With Miramar 2.0","MIUI 12, Mi 10 Lite 5G China Varient to Launch on April 27:What We know So Far","FacebookOfficially Launches Dedicated Gaming App With","Whatsapp group calls now Supoort Up to eight Users in Latest Beta Version","PUBG Mobile 0.18.0 Update Reportedly Releasing on April 224 With Miramar 2.0","MIUI 12, Mi 10 Lite 5G China Varient to Launch on April 27:What We know So Far","FacebookOfficially Launches Dedicated Gaming App With","Whatsapp group calls now Supoort Up to eight Users in Latest Beta Version"};
    String des[]={"1 hour ago","1 hour ago","1 hour ago","1 hour ago","1 hour ago","1 hour ago","1 hour ago","1 hour ago"};
    int  images[]={R.drawable.pubg,R.drawable.miui,R.drawable.facebook_name,R.drawable.whatsapp,R.drawable.pubg,R.drawable.miui,R.drawable.facebook_name,R.drawable.whatsapp};
    int  images2[]={R.drawable.ic_baseline_share_24,R.drawable.ic_baseline_share_24,R.drawable.ic_baseline_share_24,R.drawable.ic_baseline_share_24,R.drawable.ic_baseline_share_24,R.drawable.ic_baseline_share_24,R.drawable.ic_baseline_share_24,R.drawable.ic_baseline_share_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        l=findViewById(R.id.listview_review);

        Myadapter myadapter=new Myadapter(this,content,des,images,images2);
        l.setAdapter(myadapter);
    }

    class Myadapter extends ArrayAdapter<String>{

        Context context;
        String content1[];
        String des1[];
        int images1[];
        int image_share[];

        Myadapter(Context c, String title[], String time[], int img[],int img_s[]){
            super(c,R.layout.row,R.id.textView138,title);
            this.context=c;
            this.content1=title;
            this.des1=time;
            this.images1=img;
            this.image_share=img_s;
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images=row.findViewById(R.id.imageView45);
            TextView mynews=row.findViewById(R.id.textView138);
            TextView mytime=row.findViewById(R.id.textView145);
            ImageView image_sh=row.findViewById(R.id.imageView47);

            images.setImageResource(images1[position]);
            mynews.setText(content1[position]);
            mytime.setText(des1[position]);
            image_sh.setImageResource(image_share[position]);

            return row;
        }
    }
}