package pl.wroc.waw.kidsapp_simple;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import pl.wroc.waw.kidsapp_simple.categoryFactory.CategoryManufacture;
import pl.wroc.waw.kidsapp_simple.categoryFactory.Manufacture;
import pl.wroc.waw.kidsapp_simple.model.Category;
import pl.wroc.waw.kidsapp_simple.model.OneCategory;

public class GalleryActivity extends AppCompatActivity {

    final int[] song = {R.raw.jablko,
        R.raw.banan,R.raw.malina,R.raw.wisnia, R.raw.ananas, R.raw.gruszka, R.raw.jezyna, R.raw.brzoskwinia, R.raw.kiwi, R.raw.cytryna,R.raw.cytryna
    ,R.raw.pomarancza, R.raw.sliwka, R.raw.truskawka, R.raw.arbuz};

    MediaPlayer mp ;

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int ITEMS = 15;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }


        @Override
        public int getCount() {
            return ITEMS;
        }


        @Override
        public Fragment getItem(int position) {


                    return FirstFragment.newInstance( "",position);


        }


        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }

    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

		String categoryName = (String) getIntent().getExtras().get(Category.class.getCanonicalName());
        Category passedCategory = Category.valueOf(categoryName);

        final OneCategory category = Manufacture.getCategory(passedCategory);

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (mp != null) {
                    mp.stop();
                    mp.release();
                    mp = null;
                }
                mp = MediaPlayer.create(getApplicationContext(), category.getSound(position));
                    mp.start();
            }

            @Override
            public void onPageSelected(int position) {
                System.out.println("PageSelectes");
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });



    }
}

