package com.example.joker.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


//TODO 11 implement ClickListner interface and override the methods and show toast of hero name clicked in it.
public class MainActivity extends AppCompatActivity implements ClickListner{

    private List<Movie> moviesArrayList = new ArrayList<>();

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //TODO 2: Create class Hero having a constructor with fields as id,name and detail and create setters and getters respectively.



        //TODO 3: Get reference to recyclerVeiw and set its layout manager to Linear.

        movieAdapter = new MovieAdapter(moviesArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(movieAdapter);

        prepareMovieData();


    }



    private void prepareMovieData() {
        Movie movie = new Movie("Batman");
        movie.setImage(R.drawable.batman);
        moviesArrayList.add(movie);

        movie = new Movie("Deadpool");
        movie.setImage(R.drawable.deadpool);
        moviesArrayList.add(movie);

        movie = new Movie("Doctor Strange");
        movie.setImage(R.drawable.doctor_strange);
        moviesArrayList.add(movie);

        movie = new Movie("IronMan");
        movie.setImage(R.drawable.iron_man);
        moviesArrayList.add(movie);

        movie = new Movie("SpiderMan");
        movie.setImage(R.drawable.spiderman);
        moviesArrayList.add(movie);

        movie = new Movie("Thor");
        movie.setImage(R.drawable.thor);
        moviesArrayList.add(movie);


        movieAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(int position) {

    }


    //TODO 12 Using shared preference find if user is new user or not. and show toast Welcome or Welcome again accordingly.


}
