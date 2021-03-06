package binus.bmcc.artry.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import binus.bmcc.artry.MainActivity;
import binus.bmcc.artry.R;

public class DetailCarActivity extends AppCompatActivity {

    LinearLayout ln;
    TextView textUkuran, textBerat, textBuatan, textNama, textDescNama, textDesc;
    ImageView imageView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_car);
        ln = findViewById(R.id.linear_1);
        textUkuran = findViewById(R.id.text_ukuran);
        textBerat = findViewById(R.id.text_berat);
        textBuatan = findViewById(R.id.text_buatan);
        textNama = findViewById(R.id.text_name);
        textDescNama = findViewById(R.id.text_name_desc);
        textDesc = findViewById(R.id.text_desc);
        imageView = findViewById(R.id.image_top);
        btn = findViewById(R.id.btn_show_ar);
        setData();
        ln.setOnClickListener(v -> onBackPressed());
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("ar", getIntent().getStringExtra("ar"));
            startActivity(intent);
        });
    }

    private void setData() {
        textUkuran.setText(getIntent().getStringExtra("ukuran"));
        textBerat.setText(getIntent().getStringExtra("berat"));
        textBuatan.setText(getIntent().getStringExtra("buatan"));
        textNama.setText(getIntent().getStringExtra("nama"));
        textDescNama.setText(getIntent().getStringExtra("keterangan"));
        textDesc.setText(getIntent().getStringExtra("desc"));
        imageView.setImageResource(getIntent().getIntExtra("image", 0));
    }
}