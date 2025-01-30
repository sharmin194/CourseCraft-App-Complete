package com.example.coursecraftapp;

import static com.example.coursecraftapp.R.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the layout for the activity

        // Explore button click handler
        findViewById(R.id.explorebtn).setOnClickListener(view ->
                navigateToActivity(MainActivity2.class)
        );

        // Enrolled Courses button click handler
        findViewById(R.id.enrolled_courses_button).setOnClickListener(view ->
                navigateToActivity(MainActivity3.class)
        );

        // Profile button click handler
        findViewById(R.id.user_profile_button).setOnClickListener(view ->
                navigateToActivity(MainActivity4.class)
        );
    }

    // Helper method to start activities
    private void navigateToActivity(Class<?> activityClass) {
        Intent intent = new Intent(MainActivity.this, activityClass);
        startActivity(intent);
    }
}
