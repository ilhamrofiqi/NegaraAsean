package com.example.ilhamrofiqi.negaraasean;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail_activity extends AppCompatActivity {
    TextView txtv;
    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activity);

        ActionBar kembali = getSupportActionBar();
        kembali.setHomeButtonEnabled(true);
        kembali.setDisplayHomeAsUpEnabled(true);

        tv = (TextView)findViewById(R.id.tv);
        tv.setText(getIntent().getStringExtra("Name"));

        txtv = (TextView)findViewById(R.id.txtv);
        txtv.setText(getIntent().getStringExtra("Remarks"));

        tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setText(getIntent().getStringExtra("Deskripsi"));

        tv2 = (TextView)findViewById(R.id.tv2);
        tv2.setText(getIntent().getStringExtra("Ibukota"));

        tv3 = (TextView)findViewById(R.id.tv3);
        tv3.setText(getIntent().getStringExtra("Bahasa"));

        tv4 = (TextView)findViewById(R.id.tv4);
        tv4.setText(getIntent().getStringExtra("Merdeka"));

        tv5 = (TextView)findViewById(R.id.tv5);
        tv5.setText(getIntent().getStringExtra("Matauang"));

        tv6 = (TextView)findViewById(R.id.tv6);
        tv6.setText(getIntent().getStringExtra("Luas"));

        img = (ImageView)findViewById(R.id.img);
        String photo = (getIntent().getStringExtra("Photo"));
        Glide.with(this).load(photo).into(img);

    }
}
