package com.foysaldev.divisionprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = findViewById(R.id.profileImageView);
        textView = findViewById(R.id.TextViewId);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            String divisionName = bundle.getString("name");
            showDetails(divisionName);

        }
    }

    private void showDetails(String divisionName) {
        if (divisionName.equals("Dhaka")) {
            imageView.setImageResource(R.drawable.dhaka_city);
            textView.setText(R.string.Dhaka);
        }
        if (divisionName.equals("Mymensingh")) {
            imageView.setImageResource(R.drawable.china_matir_pahar);
            textView.setText(R.string.Mymensingh);
        }
        if (divisionName.equals("Barisal")) {
            imageView.setImageResource(R.drawable.hotel_sedona_international);
            textView.setText(R.string.Barisal);
        }
    }
}