package pl.wroc.waw.kidsapp_simple.model;

import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_african_animals;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_animal_cubs;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_animal_households;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_bathroom;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_body_parts;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_christmas;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_clothes;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_construction_machinery;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_easter;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_firemen;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_flowers;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_forest_animals;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_fruits;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_insects;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_kitchen;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_musical_instruments;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_pets;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_professions;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_room;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_sea;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_sea_animals;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_shapes;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_tools;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_toys;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_vegetables;
import static pl.wroc.waw.kidsapp_simple.R.drawable.icon_category_vehicles;

public enum Category {
    FRUITS(icon_category_fruits),
    PETS(icon_category_pets),
    VEGETABLES(icon_category_vegetables),
    FLOWERS(icon_category_flowers),
    TOYS(icon_category_toys),
    FOREST_ANIMALS(icon_category_forest_animals),
    SEA_ANIMALS(icon_category_sea_animals),
    AFRICAN_ANIMALS(icon_category_african_animals),
    SHAPES(icon_category_shapes),
    VEHICLES(icon_category_vehicles),
    CONSTRUCTION_MACHINERY(icon_category_construction_machinery),
    KITCHEN(icon_category_kitchen),
    ROOM(icon_category_room),
    BATHROOM(icon_category_bathroom),
    MUSICAL_INSTRUMENTS(icon_category_musical_instruments),
    SEA(icon_category_sea),
    INSECTS(icon_category_insects),
    PROFESSIONS(icon_category_professions),
    ANIMAL_CUBS(icon_category_animal_cubs),
    ANIMAL_HOUSEHOLDS(icon_category_animal_households),
    TOOLS(icon_category_tools),
    EASTER(icon_category_easter),
    CHRISTMAS(icon_category_christmas),
    BODY_PARTS(icon_category_body_parts),
    CLOTHES(icon_category_clothes),
    FIREMEN(icon_category_firemen);


    private final int resIconId;

    Category(int resIconId){
        this.resIconId = resIconId;
    }

    public int getResIconId() {
        return resIconId;
    }
}
