package pl.wroc.waw.kidsapp_simple.categoryFactory;

import android.content.Context;
import android.content.res.TypedArray;

import pl.wroc.waw.kidsapp_simple.R;
import pl.wroc.waw.kidsapp_simple.model.Category;
import pl.wroc.waw.kidsapp_simple.model.FruitCategory;
import pl.wroc.waw.kidsapp_simple.model.OneCategory;

public class CategoryManufacture extends Manufacture {


    @Override
    OneCategory createCategory(Category category) {
        OneCategory iCategory = null;

        switch (category) {
            case FRUITS:

                iCategory = new FruitCategory();

        }

        iCategory.initIds();
        createName(iCategory);
        createIcon(iCategory);

        createImages(iCategory);
        createNames(iCategory);
        createSounds(iCategory);


        return iCategory;
    }

    private void createName(OneCategory category) {
        category.setName(context.getResources().getString(category.getIdName()));
    }

    private void createIcon(OneCategory category) {
        category.setIcon(context.getResources().getDrawable(category.getIdIcon()));//
    }

    private void createNames(OneCategory category) {
        category.setNames(context.getResources().getStringArray(category.getIdNames()));
    }

    private void createImages(OneCategory category) {
        category.setImages(context.getResources().obtainTypedArray(category.getIdImages()));
    }

    private void createSounds(OneCategory category) {
        category.setSounds(category.getIdSounds());
    }
}
