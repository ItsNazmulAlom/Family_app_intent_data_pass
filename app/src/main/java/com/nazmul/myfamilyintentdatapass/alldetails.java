package com.nazmul.myfamilyintentdatapass;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alldetails extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alldetails);

        imageView=findViewById(R.id.imageView);
        textView=findViewById(R.id.textView);
        String getId=getIntent().getExtras().getString("id");


        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Details");//for actionbar title


        if (getId.equals("father")){
            imageView.setImageResource(R.drawable.father);
            textView.setText("This is Father page");
        }
        else if (getId.equals("mother")){
            imageView.setImageResource(R.drawable.mother);
            textView.setText("this is mother page");
        }
        else if (getId.equals("brother")){
            imageView.setImageResource(R.drawable.sajid);
            textView.setText("this is Brother page");
        }
        else if(getId.equals("sister")){
            imageView.setImageResource(R.drawable.saifa);
            textView.setText("this is sister page");
        }


    }
    //for back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
