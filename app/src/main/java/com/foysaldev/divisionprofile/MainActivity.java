package com.foysaldev.divisionprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton dhaka, mymensingh, barisal;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dhaka = findViewById(R.id.Dhakaid);
        mymensingh = findViewById(R.id.MymensinghId);
        barisal = findViewById(R.id.BarisalId);

        dhaka.setOnClickListener(this);
        mymensingh.setOnClickListener(this);
        barisal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Dhakaid) {
            intent = new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","Dhaka");
            startActivity(intent);
        }if (view.getId() == R.id.MymensinghId) {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "Mymensingh");
            startActivity(intent);
        } if (view.getId() == R.id.BarisalId) {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "Barisal");
            startActivity(intent);
        }
    }
}