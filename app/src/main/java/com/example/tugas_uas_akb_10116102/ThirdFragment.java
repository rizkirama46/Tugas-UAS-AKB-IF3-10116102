package com.example.tugas_uas_akb_10116102;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {

    TextView done;
    TextView back;
    ViewPager viewPager;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_third, container, false);

        // inisialisasi ViewPager dari MainActivity
        viewPager = getActivity().findViewById(R.id.viewPager);

        done = view.findViewById(R.id.sliderThreeDone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Done", Toast.LENGTH_LONG).show();
            }
        });

        back = view.findViewById(R.id.sliderThreeBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        return view;
    }

}
