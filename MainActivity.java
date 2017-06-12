package com.sezinc.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] ulkeler =
            {
                "Türkiye", "Almanya", "Avusturya", "Amerika","İngiltere",
                "Macaristan", "Yunanistan", "Rusya", "Suriye", "İran", "Irak",
                "Şili", "Brezilya", "Japonya", "Portekiz", "İspanya",
                "Makedonya", "Ukrayna", "İsviçre"
             };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView tanımı

        ListView myListView =(ListView) findViewById(R.id.listView1);

        //Array Adaptör Tanımı

        ArrayAdapter<String> myArrayAdaptor= new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1,ulkeler);

        //Listeye bilgileri doldur
        myListView.setAdapter(myArrayAdaptor);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ulkeler[position], Toast.LENGTH_SHORT).show();
                        
                        
            }
        });









    }
}
