package pl.wroc.waw.kidsapp_simple.recview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import pl.wroc.waw.kidsapp_simple.Category;
import pl.wroc.waw.kidsapp_simple.R;

public class CategoriesBrowseRecyclerViewAdapter extends RecyclerView.Adapter<CategoriesBrowseRecyclerViewHolder> {

    @NonNull
    @Override
    public CategoriesBrowseRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_butt, viewGroup, false);

        return new CategoriesBrowseRecyclerViewHolder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesBrowseRecyclerViewHolder viewHolder, int i) {
        ImageButton imgButt =  viewHolder.getCatView();
        imgButt.setImageResource(Category.values()[i].getResIconId());
    }

    @Override
    public int getItemCount() {
        return Category.values().length;
    }
}
