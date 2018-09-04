package com.example.kapil.movie_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kapil.movie_app.recyclerView.movies.Movies;
import com.squareup.picasso.Picasso;

import java.text.NumberFormat;

public class Detailed_Page extends AppCompatActivity {


    public TextView tv_title;
    public TextView tv_year;
    public TextView tv_rating;
    public TextView tv_reviews;
    public TextView tv_genre;
    public TextView tv_duration;
    public TextView tv_summary;
    private ImageView detail_image;
    private ImageView detail_banner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed__page);


        tv_title=findViewById(R.id.detail_title);
        tv_year = findViewById(R.id.detail_year);
        tv_rating= findViewById(R.id.detail_rating);
        tv_reviews=findViewById(R.id.detail_review);
        tv_genre = findViewById(R.id.detail_genre);
        tv_duration = findViewById(R.id.detail_duration);
        tv_summary = findViewById(R.id.detail_summary);
        detail_image = findViewById(R.id.detail_image);
        detail_banner =findViewById(R.id.detail_banner);

        Intent intent = getIntent();

        Movies m = intent.getParcelableExtra("movie_name");


        Picasso.with(this)
                .load(m.Banner)
                .into(detail_banner);
        tv_title.setText(m.Title);

        Picasso.with(this)
                .load(m.Image)
                .into(detail_image);

        tv_year.setText(String.valueOf(m.Year));

        tv_rating.setText(String.valueOf(m.Rating));


        NumberFormat f = NumberFormat.getInstance();



        tv_reviews.setText("Based on "+ f.format(m.Reviews) +" reviews");

        tv_genre.setText(m.Genre);

        tv_duration.setText(m.Time);

        tv_summary.setText(m.Summary);




    }
}
