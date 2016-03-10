package com.example.gtink.mystreamer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.picasso);
        Picasso.with(this)
                .load("http://i.imgur.com/DvpvklR.png")
                .resize(300, 400)
                .centerCrop()
                .into(imageView);



    }
}
