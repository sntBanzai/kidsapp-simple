package pl.wroc.waw.kidsapp_simple.categoryFactory;

import android.content.Context;

import java.util.HashMap;
import java.util.Map;

import pl.wroc.waw.kidsapp_simple.model.AfricanAnimals;
import pl.wroc.waw.kidsapp_simple.model.AnimalCubsCategory;
import pl.wroc.waw.kidsapp_simple.model.BathroomCategory;
import pl.wroc.waw.kidsapp_simple.model.BodyPartsCategory;
import pl.wroc.waw.kidsapp_simple.model.Category;
import pl.wroc.waw.kidsapp_simple.model.ChristmasCategory;
import pl.wroc.waw.kidsapp_simple.model.ClothesCategory;
import pl.wroc.waw.kidsapp_simple.model.ConstructionMachinery;
import pl.wroc.waw.kidsapp_simple.model.EasterCategory;
import pl.wroc.waw.kidsapp_simple.model.FiremenCategory;
import pl.wroc.waw.kidsapp_simple.model.FlowersCategory;
import pl.wroc.waw.kidsapp_simple.model.ForestAnimalsCategory;
import pl.wroc.waw.kidsapp_simple.model.FruitCategory;
import pl.wroc.waw.kidsapp_simple.model.InsectsCategory;
import pl.wroc.waw.kidsapp_simple.model.KitchenCategory;
import pl.wroc.waw.kidsapp_simple.model.MusicalInstrumentsCategory;
import pl.wroc.waw.kidsapp_simple.model.OneCategory;
import pl.wroc.waw.kidsapp_simple.model.PetsCategory;
import pl.wroc.waw.kidsapp_simple.model.ProfessionsCategory;
import pl.wroc.waw.kidsapp_simple.model.RoomCategory;
import pl.wroc.waw.kidsapp_simple.model.SeaAnimals;
import pl.wroc.waw.kidsapp_simple.model.SeaCategory;
import pl.wroc.waw.kidsapp_simple.model.ShapesCategory;
import pl.wroc.waw.kidsapp_simple.model.ToolsCategory;
import pl.wroc.waw.kidsapp_simple.model.ToysCategory;
import pl.wroc.waw.kidsapp_simple.model.VegetablesCategory;
import pl.wroc.waw.kidsapp_simple.model.VehiclesCategory;

public class Manufacture {

    private static Context contextApp;
    public static Map<Category, OneCategory> categoryMap;

    public static void initCategoryMap(Context context) {

        contextApp = context;
        categoryMap = new HashMap<>();
        categoryMap.put(Category.AFRICAN_ANIMALS, createCategory(Category.AFRICAN_ANIMALS));
        categoryMap.put(Category.ANIMAL_CUBS, createCategory(Category.ANIMAL_CUBS));
        categoryMap.put(Category.BATHROOM, createCategory(Category.BATHROOM));
        categoryMap.put(Category.BODY_PARTS, createCategory(Category.BODY_PARTS));
        categoryMap.put(Category.CHRISTMAS, createCategory(Category.CHRISTMAS));
        categoryMap.put(Category.CLOTHES, createCategory(Category.CLOTHES));
        categoryMap.put(Category.CONSTRUCTION_MACHINERY, createCategory(Category.CONSTRUCTION_MACHINERY));
        categoryMap.put(Category.EASTER, createCategory(Category.EASTER));
        categoryMap.put(Category.FIREMEN, createCategory(Category.FIREMEN));
        categoryMap.put(Category.FLOWERS, createCategory(Category.FLOWERS));
        categoryMap.put(Category.FOREST_ANIMALS, createCategory(Category.FOREST_ANIMALS));
        categoryMap.put(Category.FRUITS, createCategory(Category.FRUITS));
        categoryMap.put(Category.INSECTS, createCategory(Category.INSECTS));
        categoryMap.put(Category.KITCHEN, createCategory(Category.KITCHEN));
        categoryMap.put(Category.MUSICAL_INSTRUMENTS, createCategory(Category.MUSICAL_INSTRUMENTS));
        categoryMap.put(Category.PETS, createCategory(Category.PETS));
        categoryMap.put(Category.PROFESSIONS, createCategory(Category.PROFESSIONS));
        categoryMap.put(Category.ROOM, createCategory(Category.ROOM));
        categoryMap.put(Category.SEA_ANIMALS, createCategory(Category.SEA_ANIMALS));
        categoryMap.put(Category.SEA, createCategory(Category.SEA));
        categoryMap.put(Category.SHAPES, createCategory(Category.SHAPES));
        categoryMap.put(Category.TOOLS, createCategory(Category.TOOLS));
        categoryMap.put(Category.TOYS, createCategory(Category.TOYS));
        categoryMap.put(Category.VEGETABLES, createCategory(Category.VEGETABLES));
        categoryMap.put(Category.VEHICLES, createCategory(Category.VEHICLES));

    }

    private static OneCategory createCategory(Category category) {
        OneCategory iCategory = null;

        switch (category) {

            case AFRICAN_ANIMALS:
                iCategory = new AfricanAnimals();
                break;
            case ANIMAL_CUBS:
                iCategory = new AnimalCubsCategory();
                break;
            case BATHROOM:
                iCategory = new BathroomCategory();
                break;
            case BODY_PARTS:
                iCategory = new BodyPartsCategory();
                break;
            case CHRISTMAS:
                iCategory = new ChristmasCategory();
                break;
            case CLOTHES:
                iCategory = new ClothesCategory();
                break;
            case CONSTRUCTION_MACHINERY:
                iCategory = new ConstructionMachinery();
                break;
            case EASTER:
                iCategory = new EasterCategory();
                break;
            case FIREMEN:
                iCategory = new FiremenCategory();
                break;
            case FLOWERS:
                iCategory = new FlowersCategory();
                break;
            case FOREST_ANIMALS:
                iCategory = new ForestAnimalsCategory();
                break;
            case FRUITS:
                iCategory = new FruitCategory();
                break;
            case INSECTS:
                iCategory = new InsectsCategory();
                break;
            case KITCHEN:
                iCategory = new KitchenCategory();
                break;
            case MUSICAL_INSTRUMENTS:
                iCategory = new MusicalInstrumentsCategory();
                break;
            case PETS:
                iCategory = new PetsCategory();
                break;
            case PROFESSIONS:
                iCategory = new ProfessionsCategory();
                break;
            case ROOM:
                iCategory = new RoomCategory();
                break;
            case SEA_ANIMALS:
                iCategory = new SeaAnimals();
                break;
            case SEA:
                iCategory = new SeaCategory();
                break;
            case SHAPES:
                iCategory = new ShapesCategory();
                break;
            case TOOLS:
                iCategory = new ToolsCategory();
                break;
            case TOYS:
                iCategory = new ToysCategory();
                break;
            case VEGETABLES:
                iCategory = new VegetablesCategory();
                break;
            case VEHICLES:
                iCategory = new VehiclesCategory();
                break;


        }

        iCategory.initIds();

        createName(iCategory);

        createIcon(iCategory);

        createImages(iCategory);

        createNames(iCategory);

        createSounds(iCategory);


        return iCategory;
    }

    private static void createName(OneCategory category) {
        category.setName(contextApp.getResources().getString(category.getIdName()));
    }

    private static void createIcon(OneCategory category) {
        category.setIcon(contextApp.getResources().getDrawable(category.getIdIcon()));//
    }

    private static void createNames(OneCategory category) {
        category.setNames(contextApp.getResources().getStringArray(category.getIdNames()));
    }

    private static void createImages(OneCategory category) {
        category.setImages(contextApp.getResources().obtainTypedArray(category.getIdImages()));
    }

    private static void createSounds(OneCategory category) {
        category.setSounds(category.getIdSounds());
    }

    public static OneCategory getCategory(Category category){
        if(categoryMap!=null && !categoryMap.isEmpty()){
            return categoryMap.get(category);
        }
        return  null;
    }


}
