package pl.wroc.waw.kidsapp_simple.model;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

public abstract class OneCategory {

    protected int idName;
    protected int idIcon;
    protected int[] idSounds;
    protected int idImages;
    protected int idNames;


    private String name;
    private Drawable icon;

    private int[] sounds;
    private TypedArray images;
    private String[] names;

    abstract public void initIds();

    public int getIdName() {
        return idName;
    }

    public int getIdIcon() {
        return idIcon;
    }


    public int getIdImages() {
        return idImages;
    }

    public int[] getIdSounds() {
        return idSounds;
    }

    public int getIdNames() {
        return idNames;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public void setSounds(int[] sounds) {
        this.sounds = sounds;
    }

    public void setImages(TypedArray images) {
        this.images = images;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public int[] getSounds() {
        return sounds;
    }

    public int getSound(int index){
        return  sounds[index];
    }

    //Resources res = getResources();
    //String[] planets = res.getStringArray(R.array.planets_array);
 }
