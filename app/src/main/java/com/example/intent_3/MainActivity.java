package com.example.intent_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createList();
        pass();
    }

    public void createList() {
        list = new ArrayList<>();

        Model model1 = new Model("Aleksandr", "Alekhine", "000000");
        Model model2 = new Model("Mikhail", "Botvinnik", "111111");
        Model model3 = new Model("Robert", "Fischer", "222222");
        Model model4 = new Model("Magnus", "Carlsen", "333333");

        list.add(model1);
        list.add(model2);
        list.add(model3);
        list.add(model4);

    }

    public void pass() {
        listView = (ListView) findViewById(R.id.listView);
        adapter adp = new adapter(list, this, this);
        listView.setAdapter(adp);
    }
}