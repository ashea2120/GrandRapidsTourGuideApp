package com.s.liza.tourguideappgrandrapids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.amwaygrandplazahotel, R.string.one_hotel_name, R.string.one_hotel_desc, R.string.one_hotel_addr, R.string.one_hotel_work, R.string.one_hotel_tel, R.string.one_hotel_site));
        info.add(new Info(R.drawable.jwmariotthotel, R.string.two_hotel_name, R.string.two_hotel_desc, R.string.two_hotel_addr, R.string.two_hotel_work, R.string.two_hotel_tel, R.string.two_hotel_site));
        info.add(new Info(R.drawable.homewoodsuites, R.string.three_hotel_name, R.string.three_hotel_desc, R.string.three_hotel_addr, R.string.three_hotel_work, R.string.three_hotel_tel, R.string.three_hotel_site));
        info.add(new Info(R.drawable.holidayinn, R.string.four_hotel_name, R.string.four_hotel_desc, R.string.four_hotel_addr, R.string.four_hotel_work, R.string.four_hotel_tel, R.string.four_hotel_site));
        info.add(new Info(R.drawable.cityflatshotel, R.string.five_hotel_name, R.string.five_hotel_desc, R.string.five_hotel_addr, R.string.five_hotel_work, R.string.five_hotel_tel, R.string.five_hotel_site));
        info.add(new Info(R.drawable.grandriverhotel, R.string.six_hotel_name, R.string.six_hotel_desc, R.string.six_hotel_addr, R.string.six_hotel_work, R.string.six_hotel_tel, R.string.six_hotel_site));


        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
