package pl.wroc.waw.kidsapp_simple;

import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;


//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class DisplayAnimalActivity extends AppCompatActivity {

    private boolean isGreyScale = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_display_animal);
        ImageView imgView = findViewById(R.id.imageView);
        int imgToShow = (int) getIntent().getExtras().get("imgToShow");
        Bitmap btmp = getImageResourceAsBitmap(imgToShow);
        imgView.setImageBitmap(btmp);



    }

    public void goBack(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void fadeInOrOut(View v){
        isGreyScale = !isGreyScale;
        ImageView imgView = findViewById(R.id.imageView);
        int imgToShow = (int) getIntent().getExtras().get("imgToShow");
        Bitmap btmp = getImageResourceAsBitmap(imgToShow);
        imgView.setImageBitmap(btmp);
    }

    public Bitmap getImageResourceAsBitmap(int resourceIdent){
        Drawable drawable = getResources().getDrawable(resourceIdent);

        Bitmap retVal = ((BitmapDrawable) drawable).getBitmap();

        if(isGreyScale){
            Bitmap newRetVal = Bitmap.createBitmap(retVal.getWidth(), retVal.getHeight(), Bitmap.Config.ARGB_8888);

            Canvas canvas = new Canvas(newRetVal);
            Paint paint = new Paint();

            ColorMatrix cm = new ColorMatrix();
            cm.setSaturation(0);
            paint.setColorFilter(new ColorMatrixColorFilter(cm));
            canvas.drawBitmap(retVal, 0, 0, paint);
            retVal = newRetVal;
        }
        return retVal;
    }
}
