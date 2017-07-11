package ch.kr.app.joker.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ch.kr.app.joker.R;
import ch.kr.app.joker.fragment.SectionsPageAdapter;

/**
 * Created by User on 11.07.2017.
 */

public class homeFragment extends Fragment {
    private SectionsPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return inflater.inflate(R.layout.home_fragment, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        mSectionPageAdapter = new SectionsPageAdapter(getFragmentManager());
        addTabs();
    }

    private void addTabs() {
        mViewPager = (ViewPager)getView().findViewById(R.id.viewContainer);
        mViewPager.setOffscreenPageLimit(4);
        setupTabViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout)getView().findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupTabViewPager(ViewPager mViewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getFragmentManager());
        adapter.addFragment(new TabTopFragment(), getString(R.string.Top));
        adapter.addFragment(new TabTrendFragment(), getString(R.string.Trend));
        adapter.addFragment(new TabNewFragment(), getString(R.string.New));
        adapter.addFragment(new TabAboFragment(), getString(R.string.Abo));
        mViewPager.setAdapter(adapter);
    }
}
