package pl.wroc.waw.kidsapp_simple.categoryFactory;

import android.content.Context;
import android.content.res.TypedArray;

import pl.wroc.waw.kidsapp_simple.R;
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

public class CategoryManufacture extends Manufacture {

//
//    //@Override
//    OneCategory createCategory(Category category) {
//        OneCategory iCategory = null;
//
//        switch (category) {
//
//            case AFRICAN_ANIMALS:
//                iCategory = new AfricanAnimals();
//            case ANIMAL_CUBS:
//                iCategory = new AnimalCubsCategory();
//            case BATHROOM:
//                iCategory = new BathroomCategory();
//            case BODY_PARTS:
//                iCategory = new BodyPartsCategory();
//            case CHRISTMAS:
//                iCategory = new ChristmasCategory();
//            case CLOTHES:
//                iCategory = new ClothesCategory();
//            case CONSTRUCTION_MACHINERY:
//                iCategory = new ConstructionMachinery();
//            case EASTER:
//                iCategory = new EasterCategory();
//            case FIREMEN:
//                iCategory = new FiremenCategory();
//            case FLOWERS:
//                iCategory = new FlowersCategory();
//            case FOREST_ANIMALS:
//                iCategory = new ForestAnimalsCategory();
//            case FRUITS:
//                iCategory = new FruitCategory();
//            case INSECTS:
//                iCategory = new InsectsCategory();
//            case KITCHEN:
//                iCategory = new KitchenCategory();
//            case MUSICAL_INSTRUMENTS:
//                iCategory = new MusicalInstrumentsCategory();
//            case PETS:
//                iCategory = new PetsCategory();
//            case PROFESSIONS:
//                iCategory = new ProfessionsCategory();
//            case ROOM:
//                iCategory = new RoomCategory();
//            case SEA_ANIMALS:
//                iCategory = new SeaAnimals();
//            case SEA:
//                iCategory = new SeaCategory();
//            case SHAPES:
//                iCategory = new ShapesCategory();
//            case TOOLS:
//                iCategory = new ToolsCategory();
//            case TOYS:
//                iCategory = new ToysCategory();
//            case VEGETABLES:
//                iCategory = new VegetablesCategory();
//            case VEHICLES:
//                iCategory = new VehiclesCategory();
//
//
//        }
//
//        iCategory.initIds();
//        createName(iCategory);
//        createIcon(iCategory);
//
//        createImages(iCategory);
//        createNames(iCategory);
//        createSounds(iCategory);
//
//
//        return iCategory;
//    }
//
//    private void createName(OneCategory category) {
//        category.setName(context.getResources().getString(category.getIdName()));
//    }
//
//    private void createIcon(OneCategory category) {
//        category.setIcon(context.getResources().getDrawable(category.getIdIcon()));//
//    }
//
//    private void createNames(OneCategory category) {
//        category.setNames(context.getResources().getStringArray(category.getIdNames()));
//    }
//
//    private void createImages(OneCategory category) {
//        category.setImages(context.getResources().obtainTypedArray(category.getIdImages()));
//    }
//
//    private void createSounds(OneCategory category) {
//        category.setSounds(category.getIdSounds());
//    }
}
