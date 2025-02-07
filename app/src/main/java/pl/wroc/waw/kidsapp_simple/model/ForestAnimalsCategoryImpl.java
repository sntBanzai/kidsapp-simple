package pl.wroc.waw.kidsapp_simple.model;

import pl.wroc.waw.kidsapp_simple.R;

public class ForestAnimalsCategoryImpl extends CategoryImpl {

    public ForestAnimalsCategoryImpl() {
        super(Category.FOREST_ANIMALS);
    }

    @Override
    public void initIds() {
        idName = R.string.fruitCategory;
        idIcon = R.drawable.icon_category_forest_animals;

        idSounds = new int[]{R.raw.jablko,
                R.raw.banan, R.raw.malina, R.raw.wisnia, R.raw.ananas, R.raw.gruszka, R.raw.jezyna, R.raw.brzoskwinia, R.raw.kiwi, R.raw.cytryna, R.raw.cytryna
                , R.raw.pomarancza, R.raw.sliwka, R.raw.truskawka, R.raw.arbuz};
        idImages = R.array.fruits_image;
        idNames = R.array.fruit_strings;
    }
}
