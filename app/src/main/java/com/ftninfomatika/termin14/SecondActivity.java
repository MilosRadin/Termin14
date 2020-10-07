package com.ftninfomatika.termin14;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int id = getIntent().getIntExtra("id",-1);
        Fruit fruit = null;
        for(Fruit f: Fruit.fruits)
            if(f.getId()==id)
                fruit = f;
        TextView tv_name = findViewById(R.id.textView_name);
        tv_name.setText(fruit.getName() );
        TextView tv_description = findViewById(R.id.textView_description);
        tv_description.setText(fruit.getDescription() );


        try {
            InputStream is = getAssets().open(fruit.getImageFileName());
            Drawable drawable = Drawable.createFromStream(is,"");
            ImageView iv = findViewById(R.id.imageView);
            iv.setImageDrawable(drawable);
        } catch (IOException e) {
            Toast.makeText(this, "ne postoji izabrani fajl", Toast.LENGTH_SHORT);

        }

        RatingBar rb = findViewById(R.id.ratingBar);
        rb.setRating (fruit.getRating() );
        rb.setIsIndicator(true);
    }
}