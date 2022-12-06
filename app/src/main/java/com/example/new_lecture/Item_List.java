package com.example.new_lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Item_List extends AppCompatActivity {
    Button btn;
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        setContentView(R.layout.activity_main);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Rahil");
        arrayList.add("Talha");
        arrayList.add("Ali");
        arrayList.add("Huzaifa");
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.etxt);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, arrayList);
        ListView lst;
        lst = findViewById(R.id.myist);
        lst.setAdapter(arrayAdapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.add(txt.getText().toString());
                lst.setAdapter(arrayAdapter);
                //arrayAdapter.notifyDataSetChanged();
            }
        });
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                btn.setText(arrayList.get(i));
            }
        });
    }
}