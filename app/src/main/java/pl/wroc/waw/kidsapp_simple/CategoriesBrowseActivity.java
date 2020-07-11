package pl.wroc.waw.kidsapp_simple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import pl.wroc.waw.kidsapp_simple.recview.CategoriesBrowseRecyclerViewAdapter;
import pl.wroc.waw.kidsapp_simple.recview.GridAutofitLayoutManager;

public class CategoriesBrowseActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_browse);
        recyclerView = findViewById(R.id.CategoriesRecyclerView);
        //recyclerView.requestDisallowInterceptTouchEvent(true);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        //recyclerView.setHasFixedSize(true);


        layoutManager = new GridAutofitLayoutManager(getApplicationContext(), -1);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println();
            }
        });

        // specify an adapter (see also next example)
        mAdapter = new CategoriesBrowseRecyclerViewAdapter();
        recyclerView.setAdapter(mAdapter);
    }

    public void categoryButtClicked(View view) {
        View parv = (View) view.getParent();

        Animation scale =  AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        scale.setFillAfter(true);
        parv.startAnimation(scale);



      //  ScaleAnimation anim = new ScaleAnimation(1f, 0.95f, 1f, 0.95f);

       // anim.setDuration(60);
        //anim.setZAdjustment(Animation.ZORDER_BOTTOM);
        //anim.setFillBefore(true);
        //parv.startAnimation(anim);

//
//        android:
//        fromXScale = "1.0"
//        android:
//        toXScale = "0.5"
//        android:
//        fromYScale = "1.0"
//        android:
//        toYScale = "0.5"
//        android:
//        pivotX = "50%"
//        android:
//        pivotY = "50%"
//        android:
//        duration = "500"
//        android:
//        repeatCount = "1"
//        android:
//        repeatMode = "reverse"


//        AnimationSet animationSet = new AnimationSet(true);
//        animationSet.setDuration(2000);
//        animationSet.setFillAfter(true);
//
//        RotateAnimation rotateAnimation = new RotateAnimation(270, 360,
//                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        animationSet.addAnimation(rotateAnimation);
//        Animation scaleAnimation = new ScaleAnimation(1.25f, 1f, 1.25f, 1f,
//                ScaleAnimation.RELATIVE_TO_SELF, 0.5f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
//        animationSet.addAnimation(scaleAnimation);
//        parv.startAnimation(animationSet);


//        ScaleAnimation anim = new ScaleAnimation(1f, 0.95f, 1f, 0.95f);
//        anim.setDuration(60);
//        anim.setZAdjustment(Animation.ZORDER_BOTTOM);
//        anim.setFillBefore(true);
//        parv.startAnimation(anim);anim


        Object tag = view.getTag();
        if (tag instanceof Category) {
            Intent intent = new Intent(this, GalleryActivity.class);
            Bundle b = new Bundle();
            b.putString(Category.class.getCanonicalName(), ((Category) tag).name());
            intent.putExtras(b);
            startActivity(intent);
        }

    }

}
