package com.example.mohit.assignment_92;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  public int  MENU_ITEM_ITEM1 =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

////groupId, itemId, order, title

        menu.add(Menu.NONE, 1, Menu.NONE, "Computer");
        menu.add(Menu.NONE, 2, Menu.NONE, "Gamepad");
        menu.add(Menu.NONE, 3, Menu.NONE, "Camera");
        menu.add(Menu.NONE, 4, Menu.NONE, "Vedio");
        menu.add(Menu.NONE, 5, Menu.NONE, "Email");

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        Context context = this;

        if (id == 1) {
            Toast.makeText(getApplicationContext(), "clicked on Computer", Toast.LENGTH_LONG).show();
            return true;

        }else if (id == 2) {
            Toast.makeText(getApplicationContext(), "clicked on Gamepad", Toast.LENGTH_LONG).show();
            return true;

        }else if (id == 3) {
            Toast.makeText(getApplicationContext(), "clicked on Camera", Toast.LENGTH_LONG).show();
            return true;
        }else if (id == 4) {
            Toast.makeText(getApplicationContext(), "clicked on Vedio", Toast.LENGTH_LONG).show();
            return true;
        }else if (id == 5) {
            Toast.makeText(getApplicationContext(), "clicked on Email", Toast.LENGTH_LONG).show();
            return true;
        }



        return true;
    }


}
