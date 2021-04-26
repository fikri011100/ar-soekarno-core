package binus.bmcc.artry.about;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import binus.bmcc.artry.R;

public class AboutActivity extends AppCompatActivity {

    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        imgBack = findViewById(R.id.ic_back);
        imgBack.setOnClickListener(v -> onBackPressed());
    }
}