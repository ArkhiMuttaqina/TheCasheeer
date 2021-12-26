package com.arkhi.thecasheeer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class main_home extends AppCompatActivity {
    ChipNavigationBar navbar_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        navbar_bottom = findViewById(R.id.bottom_nav_bar);
        navbar_bottom.setItemSelected(R.id.bottom_nav_home,
                true);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_home,
                        new fragment_home()).commit();

        menunavbar();
    }
    private void menunavbar() {
        navbar_bottom.setOnItemSelectedListener
                (new ChipNavigationBar.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(int i) {
                        Fragment fragment = null;
                        switch (i){
                            case R.id.bottom_nav_home:
                                fragment = new fragment_home();
                                break;
                            case R.id.bottom_nav_stok:
                                fragment = new fragment_stok();
                                break;

                            case R.id.bottom_nav_trx:
                                fragment = new fragment_trx();
                                break;
                            case R.id.bottom_nav_saya:
                                fragment = new fragment_saya();
                                break;
                        }
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_home, fragment).commit();
                    }
                });
    }
}