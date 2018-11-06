package com.example.acer.myjadwal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] menuItem = {"Jadwal Kuliah", "Mata Kuliah", "Catatan", "Info"};
    Integer[] menuImage = {
            R.drawable.jadwal,
            R.drawable.catatan,
            R.drawable.matakuliah,
            R.drawable.info,
           };
    String[] menuLagi = {" Lihat jadwal kuliah ", " Tambah Edit Delete Lihat Mata Kuliah", " Catatan Pengingat", "Info Aplikasi ",};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CostumListAdapter adapter = new CostumListAdapter(this, menuItem, menuImage, menuLagi);
        listView = (ListView)findViewById(R.id.mobilelist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Yang diklik adalah posisi ke : " + position, Toast.LENGTH_LONG).show();
            }
        });
    }
}