package ch.kr.app.joker.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ch.kr.app.joker.R;

/**
 * Created by User on 11.07.2017.
 */

public class profileFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.profile_fragment, container, false);
    }
}
