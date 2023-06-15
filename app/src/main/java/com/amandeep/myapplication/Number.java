package com.amandeep.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Number extends AppCompatActivity {

    TextView num;
    Button share;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number);
        num=findViewById(R.id.txtn);
        share=findViewById(R.id.share);
        Intent intent=getIntent();
        String ans= intent.getStringExtra("number");
        String name=intent.getStringExtra("name");
        num.setText(ans);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent();
                intent1.setAction(Intent.ACTION_SEND);
                intent1.setType("text/plain");
                intent1.putExtra(Intent.EXTRA_SUBJECT,name);
                intent1.putExtra(Intent.EXTRA_TEXT,ans);
                startActivity(Intent.createChooser(intent1,"Choose a platform"));
            }
        });




    }
}
