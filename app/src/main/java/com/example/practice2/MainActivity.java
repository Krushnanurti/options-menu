package com.example.practice2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int MENU_SETTINGS = 101, MENU_BLUETOOTH_SETTINGS = 2,
            MENU_PHONE_SETTINGS = 3,MENU_SIMCARD_SETTINGS = 4,
            MENU_HISTORY = 5, MENU_SEARCH = 6, MENU_ABOUT_PHONE = 7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        makeToast("oncreateOptionsMenu");
        SubMenu subMenu=menu.addSubMenu(1,1,1,"Menu Settings");
        subMenu.add(1,2,2,"Bluetooth Setting");
        subMenu.add(1,3,3,"Phone Setting");
        subMenu.add(1,4,4,"Simcard Setting");

        MenuItem menuItemHistory=menu.add(2,5,5,"History");
        MenuItem menuItemSearch=menu.add(3,6,6,"Search");
        MenuItem menuItemPhone=menu.add(4,7,7,"About Phone");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        makeToast("onPrepareOptionMenuCalled");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId())
       {
           case MENU_ABOUT_PHONE:
               makeToast("About Phone");
               break;
           case MENU_SEARCH:
               makeToast("SeArch");
               break;
           case MENU_HISTORY:
               makeToast("History");
               break;
           case MENU_SIMCARD_SETTINGS:
               makeToast("menu simCard setting");
               break;
           case MENU_PHONE_SETTINGS:
               makeToast("menu PHone Settings");
               break;
           case MENU_BLUETOOTH_SETTINGS:
               makeToast("Bluetooth setting");
               break;
           case MENU_SETTINGS:
               makeToast("setting");
               break;

       }

        return super.onOptionsItemSelected(item);
    }
    public void makeToast(String text)
    {
        Toast.makeText(MainActivity.this,text,Toast.LENGTH_LONG).show();
    }
}