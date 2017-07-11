package ch.kr.app.joker.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ch.kr.app.joker.R;

/**
 * Created by User on 10.07.2017.
 */

public class TabTopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){


        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        JokeFragment topJoke = new JokeFragment();
        fragmentTransaction.add(R.id.topJokeFragmentContainer, topJoke, "HELLO");
        fragmentTransaction.commit();

        return inflater.inflate(R.layout.tab_top_frag_layout, container, false);
    }
}
