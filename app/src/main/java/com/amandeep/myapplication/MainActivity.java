package com.amandeep.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.edt);
        generate=findViewById(R.id.gen);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result=RandomNumber();
                Intent intent=new Intent(MainActivity.this,Number.class);
               int ans=RandomNumber();
                intent.putExtra("name",input.getText().toString());
                intent.putExtra("number",Integer.toString(ans));
                startActivity(intent);
            }
        });
    }

   public int RandomNumber()
    {
        Random random=new Random();
        int number=1000;
       int ans=random.nextInt(number);
        System.out.println(ans);
        return ans;

    }
}