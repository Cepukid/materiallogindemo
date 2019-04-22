package com.aplikasi.sahabatmengaji;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MenuUtama extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            switch (item.getItemId()) {

                case R.id.navigation_chat:
                    ft.replace(R.id.container1, new chat());
                    ft.commit();
                    return true;
                case R.id.navigation_home:
                    ft.replace(R.id.container1, new HomeFragment());
                    ft.commit();
                    return true;
                case R.id.navigation_dashboard:
                    ft.replace(R.id.container1, new Pesanan());
                    ft.commit();
                    return true;
                case R.id.navigation_akun:
                    ft.replace(R.id.container1, new AkunFragment());
                    ft.commit();
                    return true;
                case R.id.about:
                    ft.replace(R.id.container1, new AboutFragment());
                    ft.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container1, new Pesanan());
        ft.commit();
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true); // <-- added
        getSupportActionBar().setIcon(R.drawable.sahabatmengajihijau);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
