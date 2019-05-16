package com.s.liza.tourguideappgrandrapids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FestivalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.grandrapidsballoonfestival, R.string.one_fest_name, R.string.one_fest_desc, R.string.one_fest_addr, R.string.one_fest_work, R.string.one_fest_tel, R.string.one_fest_site));
        info.add(new Info(R.drawable.laughfest, R.string.two_fest_name, R.string.two_fest_desc, R.string.two_fest_addr, R.string.two_fest_work, R.string.two_fest_tel, R.string.two_fest_site));
        info.add(new Info(R.drawable.grandrapidsgreekfestival, R.string.three_fest_name, R.string.three_fest_desc, R.string.three_fest_addr, R.string.three_fest_work, R.string.three_fest_tel, R.string.three_fest_site));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
