package pl.wroc.waw.kidsapp_simple.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

public abstract class CategoryImpl {

    private final Category category;

    protected int idName;
    protected int idIcon;
    protected int[] idSounds;
    protected int idImages;
    protected int idNames;

    public CategoryImpl(Category cat){
        this.category = cat;
        initIds();
    }

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

    public int[] getSounds() {
        return getIdSounds();
    }

    public int getSound(int index){
        return  getSounds()[index];
    }

    public TypedArray getImages(Context ctx){
        return ctx.getResources().obtainTypedArray(getIdImages());
    }

    public Drawable getIcon(Context ctx){
        return ctx.getResources().getDrawable(getIdIcon());
    }

    public String[] getNames(Context ctx){
        return ctx.getResources().getStringArray(getIdNames());
    }

    public String getName(Context ctx){
        return ctx.getResources().getString(getIdName());
    }

    //Resources res = getResources();
    //String[] planets = res.getStringArray(R.array.planets_array);
 }
