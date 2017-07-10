package ch.kr.app.joker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 10.07.2017.
 */

public class FunctionActivity extends AppCompatActivity {
    private static final String MENU = "menu";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int menu = intent.getExtras().getInt(MENU);
        setContentView(R.layout.functions_layout);

        selectMenuItem(menu);

    }

    @Override
    protected void onResume(){
        super.onResume();
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigation);
        bottomNavigationView.getMenu().findItem(R.id.navigation_categorie).setChecked(true);
    }

    private void selectMenuItem(int menu) {

    }
}
