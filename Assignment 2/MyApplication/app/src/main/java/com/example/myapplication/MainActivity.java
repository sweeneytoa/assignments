package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final ArrayList<String> COUNTRIES = new ArrayList();

   /* final ArrayList<String> COUNTRIES = new ArrayList();*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*list.setAdapter(new myAdapter(this, COUNTRIES));

        COUNTRIES.add("ALBANIA");
        COUNTRIES.add("FINLAND");
        COUNTRIES.add("GERMANY");*/

        LinearLayout layout1 = new LinearLayout(this);
        LinearLayout.LayoutParams LinearParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        layout1.setLayoutParams(LinearParams);
        layout1.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout1);

        LinearLayout layout2 = new LinearLayout(this);

        layout2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        layout2.setOrientation(LinearLayout.HORIZONTAL);

        final EditText text1 = new EditText(this);
        ListView list = new ListView(this);



        COUNTRIES.add("ALBANIA");
        COUNTRIES.add("FINLAND");
        COUNTRIES.add("GERMANY");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                COUNTRIES );

        list.setAdapter(arrayAdapter);



        layout1.addView(layout2);
        layout1.addView(text1);
        layout1.addView(list);


        Button btn1 = new Button(this);
        Button btn2 = new Button(this);
        Button btn3 = new Button(this);
        btn1.setText("ADD");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String string=text1.getText().toString();
                COUNTRIES.add(string);
                arrayAdapter.notifyDataSetChanged();
            }
        });
        btn2.setText("EDIT");

        btn3.setText("REMOVE");
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String string=text1.getText().toString();
                COUNTRIES.remove(string);
                arrayAdapter.notifyDataSetChanged();

            }
        });

        LinearLayout.LayoutParams bt1params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout2.addView(btn1);
        layout2.addView(btn2);
        layout2.addView(btn3);

                /*
        LinearLayout parent = new LinearLayout(context);

        // remove this params set it up below
        parent.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        addContentView(parent,layoutParams);





                parent.setOrientation(LinearLayout.HORIZONTAL);

        //children of parent linearlayout

        ImageView iv = new ImageView(context);

        LinearLayout layout2 = new LinearLayout(context);

        layout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        layout2.setOrientation(LinearLayout.VERTICAL);

        parent.addView(iv);
        parent.addView(layout2);

        //children of layout2 LinearLayout

        TextView tv1 = new TextView(context);
        TextView tv2 = new TextView(context);
        TextView tv3 = new TextView(context);
        TextView tv4 = new TextView(context);

        layout2.addView(tv1);
        layout2.addView(tv2);
        layout2.addView(tv3);
        layout2.addView(tv4);*/

    }



   /* private class MyAdapter extends ArrayAdapter<String> {

        public MyAdapter(Context context, ArrayList strings) {
            super(context, -1, -1, strings);
        }

        @SuppressLint("ResourceType")
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LinearLayout listLayout = new LinearLayout(MainActivity.this);
            listLayout.setLayoutParams(new AbsListView.LayoutParams(
                    AbsListView.LayoutParams.WRAP_CONTENT,
                    AbsListView.LayoutParams.WRAP_CONTENT));
            listLayout.setId(5000);


            TextView listText = new TextView(MainActivity.this);
            listText.setId(5001);

            layout1.addView(listText);

            listText.setText(super.getItem(position));

            return layout1;
        }
    }*/

}
