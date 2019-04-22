package com.aplikasi.sahabatmengaji;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pesanan extends Fragment {


    public Pesanan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_pesanan, container, false);
        getActivity().setTitle("Pesanan");
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Berjalan"));
        tabLayout.addTab(tabLayout.newTab().setText("Riwayat"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        return view;

    }

}
