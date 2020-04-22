package com.sample.myapplication;

import android.os.AsyncTask;
import android.widget.ArrayAdapter;

import com.sample.myapplication.listadapters.RepoListAdapter;
import com.sample.myapplication.models.RepoData;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class RequestUtils extends AsyncTask<String, String, String> {

    RequestUtils(String url){
    }

    @Override
    protected String doInBackground(String[] objects) {
        //open the url connection usn any okhttp
        //send the request
        //handle response code, check for status
        //Capture the response and convert into data model using json/gson libs



        return null;
    }

    @Override
    protected void onPostExecute(String o) {
        //use json lib to convert to model.
        RepoData data = new RepoData();
        //mAdapter.setData(data);

        //write into database.
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        //cature the url here

    }
}
