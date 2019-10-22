package com.nazmul.myfamilyintentdatapass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   Button BtnFather,BtnMother,BtnBrother,BtnSister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnFather=findViewById(R.id.btn_father);
        BtnMother=findViewById(R.id.btn_mother);
        BtnBrother=findViewById(R.id.btn_brother);
        BtnSister=findViewById(R.id.btn_sister);

        BtnFather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,alldetails.class);
                intent.putExtra("id","father");
                startActivity(intent);
            }
        });

        BtnMother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,alldetails.class);
                intent.putExtra("id","mother");
                startActivity(intent);
            }
        });

        BtnBrother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,alldetails.class);
                intent.putExtra("id","brother");
                startActivity(intent);

            }
        });

        BtnSister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,alldetails.class);
                intent.putExtra("id","sister");
                startActivity(intent);
            }
        });




    }
}
