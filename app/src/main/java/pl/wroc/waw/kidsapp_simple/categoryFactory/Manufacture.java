package pl.wroc.waw.kidsapp_simple.categoryFactory;

import android.content.Context;

import pl.wroc.waw.kidsapp_simple.model.Category;
import pl.wroc.waw.kidsapp_simple.model.OneCategory;

public abstract class Manufacture {

    Context context;

    public OneCategory manufactureCategory(Context context) {
        this.context = context;
        OneCategory category = createCategory(Category.FRUITS);

        return category;
    }

    abstract OneCategory createCategory(Category category);

}
