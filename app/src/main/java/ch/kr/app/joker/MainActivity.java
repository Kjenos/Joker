package ch.kr.app.joker;

import android.app.Fragment;
import android.app.TabActivity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String MENU = "menu";
    private TextView mTextMessage;
    private static final String TAG = "MainActivity";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;

    private BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Starting.");



        final ViewPager NavigationViewPager = (ViewPager)findViewById(R.id.fragmentView);
        NavigationViewPager.setOffscreenPageLimit(5);
        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        //mViewPager = (ViewPager)findViewById(R.id.viewContainer);
        setupNavigationViewPager(NavigationViewPager);
        //TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        //tabLayout.setupWithViewPager(mViewPager);

        /*mNavigationPageAdapter = new NavigationPageAdapter(getSupportFragmentManager());

        mNavigationViewPager = (ViewPager)findViewById(R.id.fragmentView);
        setupNavigationViewPager(mNavigationViewPager);*/

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.navigation_home:
                        NavigationViewPager.setCurrentItem(0);
                        break;
                    case R.id.navigation_category:
                        NavigationViewPager.setCurrentItem(1);
                        break;
                    case R.id.navigation_add:
                        NavigationViewPager.setCurrentItem(2);
                        break;
                    case R.id.navigation_favorite:
                        NavigationViewPager.setCurrentItem(3);
                        break;
                    case R.id.navigation_profil:
                        NavigationViewPager.setCurrentItem(4);
                        break;
                }
                return true;
            }
        });


    }

    private void setupNavigationViewPager(ViewPager NavigationViewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new homeFragment(), getString(R.string.title_home));
        adapter.addFragment(new categoryFragment(), getString(R.string.title_Category));
        adapter.addFragment(new categoryFragment(), getString(R.string.title_Category));
        adapter.addFragment(new categoryFragment(), getString(R.string.title_Category));
        adapter.addFragment(new categoryFragment(), getString(R.string.title_Category));
        NavigationViewPager.setAdapter(adapter);
    }

    /*private void setupNavigationViewPager(ViewPager mNavigationViewPager) {
        NavigationPageAdapter adapter = new NavigationPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new categoryFragment(), getString(R.string.title_Category));
        adapter.addFragment(new categoryFragment(), getString(R.string.title_Category));
        mNavigationViewPager.setAdapter(adapter);
    }*/


    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabTopFragment(), getString(R.string.Top));
        adapter.addFragment(new TabTrendFragment(), getString(R.string.Trend));
        adapter.addFragment(new TabNewFragment(), getString(R.string.New));
        adapter.addFragment(new TabAboFragment(), getString(R.string.Abo));
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

}
