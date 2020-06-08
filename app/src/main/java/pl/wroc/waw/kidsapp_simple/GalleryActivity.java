package pl.wroc.waw.kidsapp_simple;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.io.IOException;

public class GalleryActivity extends AppCompatActivity {


    MediaPlayer mp;

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return FirstFragment.newInstance( "Page # 1",0);
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return FirstFragment.newInstance("Page # 2", 1);
                case 2: // Fragment # 1 - This will show SecondFragment
                    return SecondFragment.newInstance( "Page # 3",2);
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
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
                mp = MediaPlayer.create(getApplicationContext(), R.raw.gruszka);
                mp.start();
                System.out.println("PageScrolled "+position);
            }

            @Override
            public void onPageSelected(int position) {
                System.out.println("PageSelectes");
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                System.out.println("pageScrollState");
            }
        });



    }
}

