package com.jacob.menu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {


    private int[] mDrawables = new int[]{
            R.drawable.ic_menu_1,
            R.drawable.ic_menu_2,
            R.drawable.ic_menu_3,
            R.drawable.ic_menu_4,
            R.drawable.ic_menu_5,
            R.drawable.ic_menu_6};

    private String[] mTitles = new String[]{
            "AB","AC","AD","AE","AF","AG"};


    private MenuView mMenuView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMenuView = (MenuView) findViewById(R.id.menu_view);

        mMenuView.setMenuResource(mDrawables,mTitles);
        mMenuView.setOnMenuClickListener(new MenuView.onMenuClickListener() {
            @Override
            public void onMenuClick(int position) {
                Toast.makeText(MainActivity.this,""+(position+1),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
