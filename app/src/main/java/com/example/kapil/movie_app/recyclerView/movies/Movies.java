package com.example.kapil.movie_app.recyclerView.movies;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

public class Movies implements Parcelable {
    public String Image;
    public String Title;
    public Integer Year;
    public String Genre;
    public String Director;
    public Double Rating;
    public String Certification;
    public String Time;
    public String Summary;
    public Integer Reviews;
    public String Banner;

    public Movies(String banner, String image, String title, Integer year, String genre, String director, Double rating, String certification, String time, String summary, Integer reviews) {
        Banner = banner;
        Image = image;
        Title = title;
        Year = year;
        Genre = genre;
        Director = director;
        Rating = rating;
        Certification = certification;
        Time = time;
        Summary = summary;
        Reviews = reviews;

    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Banner);
        dest.writeString(this.Image);
        dest.writeString(this.Title);
        dest.writeValue(this.Year);
        dest.writeString(this.Genre);
        dest.writeString(this.Director);
        dest.writeValue(this.Rating);
        dest.writeString(this.Certification);
        dest.writeString(this.Time);
        dest.writeString(this.Summary);
        dest.writeValue(this.Reviews);
    }

    protected Movies(Parcel in) {
        this.Banner=in.readString();
        this.Image = in.readString();
        this.Title = in.readString();
        this.Year = (Integer) in.readValue(Integer.class.getClassLoader());
        this.Genre = in.readString();
        this.Director = in.readString();
        this.Rating = (Double) in.readValue(Double.class.getClassLoader());
        this.Certification = in.readString();
        this.Time = in.readString();
        this.Summary = in.readString();
        this.Reviews = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Movies> CREATOR = new Parcelable.Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies(source);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };
}
