package pl.wroc.waw.kidsapp_simple;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        //recyclerView.setHasFixedSize(true);


        layoutManager = new GridAutofitLayoutManager(getApplicationContext(), -1);

        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new CategoriesBrowseRecyclerViewAdapter();
        recyclerView.setAdapter(mAdapter);
    }

}
