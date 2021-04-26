package binus.bmcc.artry.menu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.github.islamkhsh.CardSliderAdapter;

import java.util.ArrayList;

import binus.bmcc.artry.MainActivity;
import binus.bmcc.artry.R;
import binus.bmcc.artry.detail.DetailCarActivity;

public class MenuAdapter extends CardSliderAdapter<MenuAdapter.MenuViewHolder> {

    private ArrayList<Menu> menu;
    private Context context;

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    public MenuAdapter(ArrayList<Menu> menu, Context context) {
        this.menu = menu;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    @Override
    public void bindVH(MenuViewHolder menuViewHolder, int i) {
        menuViewHolder.textMobil.setText(menu.get(i).getNamaMobil());
        menuViewHolder.textDesc.setText(menu.get(i).getKeterangan());
        menuViewHolder.imageMobil.setImageResource(menu.get(i).getImage());
        menuViewHolder.cons.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailCarActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("nama", menu.get(i).getNamaMobil());
            intent.putExtra("keterangan", menu.get(i).getKeterangan());
            intent.putExtra("ar", menu.get(i).getAr());
            intent.putExtra("berat", menu.get(i).getBerat());
            intent.putExtra("buatan", menu.get(i).getBuatan());
            intent.putExtra("desc", menu.get(i).getDesc());
            intent.putExtra("image", menu.get(i).getImageDetail());
            intent.putExtra("ukuran", menu.get(i).getUkuran());
            context.startActivity(intent);
        });
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        TextView textMobil, textDesc;
        ImageView imageMobil;
        ConstraintLayout cons;
        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            textMobil = itemView.findViewById(R.id.mobil_title);
            textDesc = itemView.findViewById(R.id.mobil_overview);
            imageMobil = itemView.findViewById(R.id.mobil_poster);
            cons = itemView.findViewById(R.id.cons_menu);
        }
    }
}
