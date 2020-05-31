package pl.wroc.waw.kidsapp_simple;

public enum Category {
    FRUITS(R.drawable.icon_category_fruits),
    ANIMALS(R.drawable.icon_category_animals),
    VEGETABLES(R.drawable.icon_category_vegetables),
    FLOWERS(R.drawable.icon_category_flowers),
    TOYS(R.drawable.icon_category_toys);

    private final int resIconId;

    Category(int resIconId){
        this.resIconId = resIconId;
    }

    public int getResIconId() {
        return resIconId;
    }
}
