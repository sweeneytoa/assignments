package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewResult;
    
    private RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       mTextViewResult = findViewById(R.id.text_view_result);



        mQueue = Volley.newRequestQueue(this);
        jsonParse();
        jsonParse1();
        jsonParse2();
        jsonParse3();



    }

    private void jsonParse() {

        String url = "https://financialmodelingprep.com/api/company/price/NOK?datatype=json";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject jsonObject = response.getJSONObject("NOK");






                                double price = jsonObject.getDouble("price");


                                mTextViewResult.append("\n\n Nokia: " + String.valueOf(price) + " USD");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });


        mQueue.add(request);
    }

   private void jsonParse1() {

        String url = "https://financialmodelingprep.com/api/company/price/FB?datatype=json";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject jsonObject = response.getJSONObject("FB");






                            double price = jsonObject.getDouble("price");


                            mTextViewResult.append("\n\n Facebook: " + String.valueOf(price) + " USD" );

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });


        mQueue.add(request);
    }


    private void jsonParse2() {

        String url = "https://financialmodelingprep.com/api/company/price/GOOGL?datatype=json";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject jsonObject = response.getJSONObject("GOOGL");






                            double price = jsonObject.getDouble("price");


                            mTextViewResult.append("\n\n Alphabet (Google): " + String.valueOf(price) + " USD" );

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });


        mQueue.add(request);
    }

    private void jsonParse3() {

        String url = "https://financialmodelingprep.com/api/company/price/AAPL?datatype=json";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject jsonObject = response.getJSONObject("AAPL");






                            double price = jsonObject.getDouble("price");


                            mTextViewResult.append("\n\n Apple: " + String.valueOf(price) + " USD" );

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });


        mQueue.add(request);
    }
}
