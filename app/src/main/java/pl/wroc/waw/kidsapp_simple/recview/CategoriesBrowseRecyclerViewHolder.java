package pl.wroc.waw.kidsapp_simple.recview;


import android.view.View;

import androidx.annotation.NonNull;

import static pl.wroc.waw.kidsapp_simple.R.id.category_ico;

public class CategoriesBrowseRecyclerViewHolder extends ImageButtonViewHolder {

    public CategoriesBrowseRecyclerViewHolder(@NonNull View catView) {
        super(catView);
        this.imageButtonView = catView.findViewById(category_ico);
    }

}
