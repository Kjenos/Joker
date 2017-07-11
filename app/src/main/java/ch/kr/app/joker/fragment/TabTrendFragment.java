package ch.kr.app.joker.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ch.kr.app.joker.R;

/**
 * Created by User on 10.07.2017.
 */

public class TabTrendFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.tab_trend_frag_layout, container, false);
    }
}
