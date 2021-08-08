package be.ehb.recyclerdemo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.ehb.recyclerdemo.R;


public class JokeListFragment extends Fragment {



    public JokeListFragment() {
        // Required empty public constructor
    }


    public static JokeListFragment newInstance() {
       // JokeListFragment fragment = new JokeListFragment();

        // return fragment;
        // dit kan efficienter
        return new JokeListFragment();
    }


   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // liever om de return in variabele apart in een View rootView
        // om findbyID
       View  rootView= inflater.inflate(R.layout.fragment_joke_list, container, false);
      return rootView;
    }
}
