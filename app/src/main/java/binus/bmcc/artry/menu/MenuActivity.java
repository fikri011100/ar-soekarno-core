package binus.bmcc.artry.menu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.islamkhsh.CardSliderViewPager;

import java.util.ArrayList;

import binus.bmcc.artry.R;

public class MenuActivity extends AppCompatActivity {

    ArrayList<Menu> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        addArray();

        CardSliderViewPager cardSliderViewPager = findViewById(R.id.viewPager);
        cardSliderViewPager.setAdapter(new MenuAdapter(movies, getApplicationContext()));
    }

    private void addArray() {
        movies.add(new Menu("Buick 8", "Mobil Ir Soekarno Pertama", "20 x 20 x 19 m", "45 kg", "Amerika", "untitled.sfb", getString(R.string.lorem_ipsum),  R.drawable.buick));
        movies.add(new Menu("DeSoto 1938", "Mobil Ir Soekarno Kedua", "20 x 20 x 19 m", "45 kg", "Amerika", "untitled.sfb", getString(R.string.lorem_ipsum),  R.drawable.buick));
        movies.add(new Menu("Imperial 1939", "Mobil Ir Soekarno Ketiga", "20 x 20 x 19 m", "45 kg", "Amerika", "untitled2.sfb", getString(R.string.lorem_ipsum),  R.drawable.imperial));
    }
}