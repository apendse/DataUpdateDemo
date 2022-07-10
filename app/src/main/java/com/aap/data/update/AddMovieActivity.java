package com.aap.data.update;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.result.ActivityResult;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.aap.data.update.cache.Movies;
import com.aap.data.update.data.Movie;

public class AddMovieActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        findViewById(R.id.create).setOnClickListener(view -> {
            createMovie();
        });

    }

    private void createMovie() {
        EditText nameEdit = findViewById(R.id.editMovieName);
        EditText yearEdit = findViewById(R.id.editMovieYear);
        String name = nameEdit.getText().toString();
        String yearString = yearEdit.getText().toString();
        if (name.isEmpty() || yearString.isEmpty()) {
            return;
        }
        int year = Integer.parseInt(yearString);
        Movies.addMovie(new Movie(name, year));
        setResult(Activity.RESULT_OK);
        finish();
    }
}
