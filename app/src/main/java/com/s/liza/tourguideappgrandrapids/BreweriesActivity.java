package com.s.liza.tourguideappgrandrapids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BreweriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();

        info.add(new Info(R.drawable.grandrapidsbrewingco, R.string.one_brew_name, R.string.one_brew_desc, R.string.one_brew_addr, R.string.one_brew_work, R.string.one_brew_tel, R.string.one_brew_site));
        info.add(new Info(R.drawable.breweryvivant, R.string.two_brew_name, R.string.two_brew_desc, R.string.two_brew_addr, R.string.two_brew_work, R.string.one_brew_tel, R.string.two_brew_site));
        info.add(new Info(R.drawable.foundersbrewingcompany, R.string.three_brew_name, R.string.three_brew_desc, R.string.three_brew_addr, R.string.three_brew_work, R.string.three_brew_tel, R.string.three_brew_site));
        info.add(new Info(R.drawable.newhollandbrewery, R.string.four_brew_name, R.string.four_brew_desc, R.string.four_brew_addr, R.string.four_brew_work, R.string.four_brew_tel, R.string.four_brew_site));
        info.add(new Info(R.drawable.mittenbrewingcompany, R.string.five_brew_name, R.string.five_brew_desc, R.string.five_brew_addr, R.string.five_brew_work, R.string.five_brew_tel, R.string.five_brew_site));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
