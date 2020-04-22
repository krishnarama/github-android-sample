package com.sample.myapplication.listadapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.sample.myapplication.models.RepoData;

public class RepoListAdapter extends ArrayAdapter<String> {
    RepoData mData;
    public RepoListAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public void setData(RepoData data){
        mData = data;
    }


}
