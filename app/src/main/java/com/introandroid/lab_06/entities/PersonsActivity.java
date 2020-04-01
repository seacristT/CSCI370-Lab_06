package com.introandroid.lab_06.entities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.introandroid.lab_06.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PersonsActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_persons);
        listView = findViewById(R.id.personList);

        ArrayList<String> i = (ArrayList) this.getIntent().getExtras().get("Persons");
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,i);
        listView.setAdapter(adapter);

    }
}
