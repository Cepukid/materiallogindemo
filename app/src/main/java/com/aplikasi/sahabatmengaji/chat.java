package com.aplikasi.sahabatmengaji;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class chat extends Fragment {
    RecyclerView rvchat;
    private ArrayList<item_chat> list;

    public chat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_chat, container, false);
        rvchat = view.findViewById(R.id.rv_category);
        rvchat.setHasFixedSize(true);
        list = new ArrayList<>();
        rvchat.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        AdapterChat cardViewHeroAdapter = new AdapterChat(getActivity().getApplicationContext());
        list.add(new item_chat("alfin","Alf8n","https://www.facebook.com/images/fb_icon_325x325.png"));
        list.add(new item_chat("alfin","Alf8n","https://www.facebook.com/images/fb_icon_325x325.png"));
        list.add(new item_chat("alfin","Alf8n","https://www.facebook.com/images/fb_icon_325x325.png"));
        list.add(new item_chat("alfin","Alf8n","https://www.facebook.com/images/fb_icon_325x325.png"));
        cardViewHeroAdapter.setitemchat(list);
        rvchat.setAdapter(cardViewHeroAdapter);
        return view;
    }

}
