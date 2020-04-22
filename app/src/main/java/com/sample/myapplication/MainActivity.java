package com.sample.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.sample.myapplication.listadapters.RepoListAdapter;

public class MainActivity extends AppCompatActivity {


    private Button mJavaButton;
    private Button mAndroidButton;

    private ListView mRepoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRepoListView = findViewById(R.id.repolist);

        mJavaButton = (Button)findViewById(R.id.button1);
        mAndroidButton = findViewById(R.id.button2);

        final RepoListAdapter adapter = new RepoListAdapter(getApplicationContext(), android.R.layout.activity_list_item);

        mRepoListView.setAdapter(adapter);

        mJavaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RequestUtils utils = new RequestUtils("url" );
                utils.execute("url","");
            }
        });


        mAndroidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
