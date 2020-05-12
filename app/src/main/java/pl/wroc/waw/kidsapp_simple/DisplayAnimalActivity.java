package pl.wroc.waw.kidsapp_simple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DisplayAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_animal);
        ImageView imgView = findViewById(R.id.imageView);
        int imgToShow = (int) getIntent().getExtras().get("imgToShow");
        imgView.setImageResource(imgToShow);
    }

    public void goBack(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
