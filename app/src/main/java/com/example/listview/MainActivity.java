package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) this.findViewById(R.id.listViews);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.rus, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.africa, R.string.africa, R.string.africaZAR));
        list.add(new DataFlags(R.drawable.flag_singapur, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.turk, R.string.turkish, R.string.turkishTRY));
        list.add(new DataFlags(R.drawable.china, R.string.china, R.string.chinaCNY));
        list.add(new DataFlags(R.drawable.angl, R.string.english, R.string.englishGBR));
        list.add(new DataFlags(R.drawable.america, R.string.usa, R.string.usaUSD));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
       // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelectes(MenuItem item)
    {
        int id = item.getItemId();
/*
        if (id == R.id.action_settings) {
            return true;
        }

 */

        return super.onOptionsItemSelected(item);
    }
}