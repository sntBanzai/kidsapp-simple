package pl.wroc.waw.kidsapp_simple;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    private String title;
    private int page;

    public FirstFragment() {

    }

    public static FirstFragment newInstance(String title, int page) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putInt("SomeInt", page);
        args.putString("SomeString", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString("SomeString");
            page = getArguments().getInt("SomeInt",0);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        tvLabel.setText(page + " -- " + title);
        ImageView image = view.findViewById(R.id.imageView3);
        Resources res = getResources();
        TypedArray images = res.obtainTypedArray(R.array.fruits_image);
        Drawable drawable = images.getDrawable(page);
        image.setImageDrawable(drawable);


        return view;
    }
}
