package com.example.namelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName = findViewById(R.id.textName);
        Button button = findViewById(R.id.button);
        ListView listName = findViewById(R.id.listName);
        final List<String> data = new ArrayList<String>();
        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listName.setAdapter(stringArrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textName.getText().toString();
                data.add(name);
                stringArrayAdapter.notifyDataSetChanged();
                textName.setText("");
            }
        });

    }
}