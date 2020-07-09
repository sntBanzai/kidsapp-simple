package pl.wroc.waw.kidsapp_simple.categoryFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import pl.wroc.waw.kidsapp_simple.model.AfricanAnimalsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.AnimalCubsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.AnimalHouseholdsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.BathroomCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.BodyPartsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.Category;
import pl.wroc.waw.kidsapp_simple.model.ChristmasCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.ClothesCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.ConstructionMachineryCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.EasterCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.FiremenCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.FlowersCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.ForestAnimalsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.FruitCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.InsectsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.KitchenCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.MusicalInstrumentsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.CategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.PetsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.ProfessionsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.RoomCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.SeaAnimalsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.SeaCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.ShapesCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.ToolsCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.ToysCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.VegetablesCategoryImpl;
import pl.wroc.waw.kidsapp_simple.model.VehiclesCategoryImpl;

public class Manufacture {

    private static final Map<Category, CategoryImpl> categoryMap = initCategoryMap();

    public static Map<Category, CategoryImpl> initCategoryMap() {
        Map<Category, CategoryImpl> categoryMap = new HashMap<>();
        for(Category cat : Category.values()){
            categoryMap.put(cat, createCategoryImpl(cat));
        }
        return Collections.unmodifiableMap(categoryMap);
    }

    private static CategoryImpl createCategoryImpl(Category category) {

        switch (category) {

            case AFRICAN_ANIMALS:
                return new AfricanAnimalsCategoryImpl();
            case ANIMAL_CUBS:
                return new AnimalCubsCategoryImpl();
            case BATHROOM:
                return new BathroomCategoryImpl();
            case BODY_PARTS:
                return new BodyPartsCategoryImpl();
            case CHRISTMAS:
                return new ChristmasCategoryImpl();
            case CLOTHES:
                return new ClothesCategoryImpl();
            case CONSTRUCTION_MACHINERY:
                return new ConstructionMachineryCategoryImpl();
            case EASTER:
                return new EasterCategoryImpl();
            case FIREMEN:
                return new FiremenCategoryImpl();
            case FLOWERS:
                return new FlowersCategoryImpl();
            case FOREST_ANIMALS:
                return new ForestAnimalsCategoryImpl();
            case FRUITS:
                return new FruitCategoryImpl();
            case INSECTS:
                return new InsectsCategoryImpl();
            case KITCHEN:
                return new KitchenCategoryImpl();
            case MUSICAL_INSTRUMENTS:
                return new MusicalInstrumentsCategoryImpl();
            case PETS:
                return new PetsCategoryImpl();
            case PROFESSIONS:
                return new ProfessionsCategoryImpl();
            case ROOM:
                return new RoomCategoryImpl();
            case SEA_ANIMALS:
                return new SeaAnimalsCategoryImpl();
            case SEA:
                return new SeaCategoryImpl();
            case SHAPES:
                return new ShapesCategoryImpl();
            case TOOLS:
                return new ToolsCategoryImpl();
            case TOYS:
                return new ToysCategoryImpl();
            case VEGETABLES:
                return new VegetablesCategoryImpl();
            case VEHICLES:
                return new VehiclesCategoryImpl();
            case ANIMAL_HOUSEHOLDS:
                return new AnimalHouseholdsCategoryImpl();
        }

        return null;
    }

    public static CategoryImpl getCategory(Category category){
        return  categoryMap.get(category);
    }


}
