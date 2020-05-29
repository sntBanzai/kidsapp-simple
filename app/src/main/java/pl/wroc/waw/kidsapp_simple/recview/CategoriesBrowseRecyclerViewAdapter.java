package pl.wroc.waw.kidsapp_simple.recview;


import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoriesBrowseRecyclerViewAdapter extends RecyclerView.Adapter<CategoriesBrowseRecyclerViewHolder> {

    @NonNull
    @Override
    public CategoriesBrowseRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CategoriesBrowseRecyclerViewHolder(viewGroup);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesBrowseRecyclerViewHolder categoriesBrowseRecyclerViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
