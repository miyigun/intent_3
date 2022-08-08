package com.example.intent_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name, surname, tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        define();
        getData();
    }

    public void define() {
        name = (TextView) findViewById(R.id.text_name);
        surname = (TextView) findViewById(R.id.text_surname);
        tel = (TextView) findViewById(R.id.text_tel);
    }

    public void getData() {
        Bundle bundle = getIntent().getExtras();
        String comingName = bundle.getString("name");
        String comingSurname = bundle.getString("surname");
        String comingTel = bundle.getString("tel");

        name.setText(comingName);
        surname.setText(comingSurname);
        tel.setText(comingTel);
    }
}