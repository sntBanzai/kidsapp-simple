package pl.wroc.waw.kidsapp_simple.recview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

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
