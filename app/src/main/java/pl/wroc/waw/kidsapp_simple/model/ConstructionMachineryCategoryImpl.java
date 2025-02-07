package pl.wroc.waw.kidsapp_simple.model;

import pl.wroc.waw.kidsapp_simple.R;

public class ConstructionMachineryCategoryImpl extends CategoryImpl {

    public ConstructionMachineryCategoryImpl() {
        super(Category.CONSTRUCTION_MACHINERY);
    }

    @Override
    public void initIds() {
        idName = R.string.fruitCategory;
        idIcon = R.drawable.icon_category_construction_machinery;

        idSounds = new int[]{R.raw.jablko,
                R.raw.banan, R.raw.malina, R.raw.wisnia, R.raw.ananas, R.raw.gruszka, R.raw.jezyna, R.raw.brzoskwinia, R.raw.kiwi, R.raw.cytryna, R.raw.cytryna
                , R.raw.pomarancza, R.raw.sliwka, R.raw.truskawka, R.raw.arbuz};
        idImages = R.array.fruits_image;
        idNames = R.array.fruit_strings;
    }
}
