package com.example.sau.malnutrition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Existing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing);
    }
    public void callProfile(View view)
    {
        Intent intent = new Intent(Existing.this, Camera.class);
        startActivity(intent);
    }
}