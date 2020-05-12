package pl.wroc.waw.kidsapp_simple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view){
        Intent intent = new Intent(this,DisplayAnimalActivity.class);
        Bundle b = new Bundle();
        switch (view.getId()){
            case R.id.muckaButton:
                b.putInt("imgToShow", R.drawable.mucka);
                break;
            case R.id.owcaButton:
                b.putInt("imgToShow", R.drawable.sheep);
                break;
            case R.id.swiniaButton:
                b.putInt("imgToShow", R.drawable.pig);
                break;
        }
        intent.putExtras(b);
        startActivity(intent);



    }
}
