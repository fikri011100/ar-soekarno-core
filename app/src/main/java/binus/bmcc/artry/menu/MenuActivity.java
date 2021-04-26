package binus.bmcc.artry.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.github.islamkhsh.CardSliderViewPager;

import java.util.ArrayList;

import binus.bmcc.artry.R;
import binus.bmcc.artry.about.AboutActivity;

public class MenuActivity extends AppCompatActivity {

    ArrayList<Menu> movies = new ArrayList<>();
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        addArray();

        CardSliderViewPager cardSliderViewPager = findViewById(R.id.viewPager);
        btn = findViewById(R.id.btn_tentang);
        cardSliderViewPager.setAdapter(new MenuAdapter(movies, getApplicationContext()));
        btn.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), AboutActivity.class));
        });
    }

    private void addArray() {
        movies.add(new Menu("Buick 8", "Mobil Ir Soekarno Pertama", "20 x 20 x 19 m", "45 kg", "Amerika", "buick.sfb", getString(R.string.buick8_detail), R.drawable.buick, R.drawable.image_buick_detail));
        movies.add(new Menu("DeSoto 1938", "Mobil Ir Soekarno Kedua", "20 x 20 x 19 m", "45 kg", "Amerika", "desoto.sfb", getString(R.string.desoto_detail), R.drawable.image_desoto, R.drawable.mobil_detail_dua));
        movies.add(new Menu("Imperial 1939", "Mobil Ir Soekarno Ketiga", "20 x 20 x 19 m", "45 kg", "Amerika", "imperial.sfb", getString(R.string.imperial_detail), R.drawable.imperial, R.drawable.mobil_detail_tiga));
    }
}