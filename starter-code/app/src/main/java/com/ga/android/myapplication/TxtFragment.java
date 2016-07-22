package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by raymour on 7/21/16.
 */
public class TxtFragment extends Fragment {

    TextView textView;

    public static TxtFragment newInstance (int tabPosition) {
        TxtFragment txtFragment = new TxtFragment();
        Bundle args = new Bundle();
        args.putInt("tab_position", tabPosition);
        txtFragment.setArguments(args);
        return txtFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View viewRoot = inflater.inflate(R.layout.fragment_text, container, false);
        textView = (TextView) viewRoot.findViewById(R.id.textView_fragment);
        return viewRoot;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        int tabNumber = getArguments().getInt("tab_position", 1);
        switch (tabNumber) {
            default:
            case 1:
                textView.setText("Hi, My name is Raymour... Join me for a cup of tea!");
                break;
            case 2:
                textView.setText("My phone number is 867-Five, Three, Ohhh, Ninneeeee");
                break;
        }
    }
}
