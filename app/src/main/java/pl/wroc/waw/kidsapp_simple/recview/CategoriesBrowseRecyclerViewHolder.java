package pl.wroc.waw.kidsapp_simple.recview;


import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static pl.wroc.waw.kidsapp_simple.R.id.category_ico;

public class CategoriesBrowseRecyclerViewHolder extends RecyclerView.ViewHolder {

    private ImageButton catView;

    public CategoriesBrowseRecyclerViewHolder(@NonNull View catView) {
        super(catView);
        this.catView = catView.findViewById(category_ico);
    }

    public ImageButton getCatView() {
        return catView;
    }
}
