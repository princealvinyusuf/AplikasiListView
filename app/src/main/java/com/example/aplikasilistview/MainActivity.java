package com.example.aplikasilistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView lvItem;
    private String[] namaNegara = new String[]{
            "Indonesia", "Malaysia", "Singapore", "Italia", "Inggris", "Belanda", "Argentina", "Chile", "Mesir",
            "Uganda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("ListView Sederhana");
        }

        lvItem = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namaNegara);

        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Toast.makeText(this, "Memilih : "+namaNegara[position], Toast.LENGTH_SHORT).show();
    }
}