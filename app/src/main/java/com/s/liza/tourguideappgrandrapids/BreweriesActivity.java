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

        info.add(new Info(R.drawable.grandrapidsbrewingco, R.string.one_mus_name, R.string.one_mus_desc, R.string.one_mus_addr, R.string.one_mus_work, R.string.one_mus_tel, R.string.one_mus_site));
        info.add(new Info(R.drawable.breweryvivant, R.string.two_mus_name, R.string.two_mus_desc, R.string.two_mus_addr, R.string.two_mus_work, R.string.one_mus_tel, R.string.two_mus_site));
        info.add(new Info(R.drawable.foundersbrewingcompany, R.string.three_mus_name, R.string.three_mus_desc, R.string.three_mus_addr, R.string.three_mus_work, R.string.three_mus_tel, R.string.three_mus_site));
        info.add(new Info(R.drawable.newhollandbrewery, R.string.four_mus_name, R.string.four_mus_desc, R.string.four_mus_addr, R.string.four_mus_work, R.string.four_mus_tel, R.string.four_mus_site));
        info.add(new Info(R.drawable.mittenbrewingcompany, R.string.five_mus_name, R.string.five_mus_desc, R.string.five_mus_addr, R.string.five_mus_work, R.string.five_mus_tel, R.string.five_mus_site));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
