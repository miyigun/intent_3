package com.example.intent_3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class adapter extends BaseAdapter {

    List<Model> list;
    Context context;
    Activity activity;

    public adapter(List<Model> list, Context context, Activity activity) {
        this.list = list;
        this.context = context;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.layout, viewGroup, false);

        TextView name = (TextView) view.findViewById(R.id.name);
        TextView surname = (TextView) view.findViewById(R.id.surname);
        TextView tel = (TextView) view.findViewById(R.id.tel);

        LinearLayout linearLayout = view.findViewById(R.id.mainLayout);

        final String name_ = list.get(i).getName();
        final String surname_ = list.get(i).getSurname();
        final String tel_ = list.get(i).getTel();

        name.setText(name_);
        surname.setText(surname_);
        tel.setText(tel_);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("name", name_);
                intent.putExtra("surname", surname_);
                intent.putExtra("tel", tel_);

                activity.startActivity(intent);


            }
        });

        return view;
    }
}
