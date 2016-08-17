package com.example.azvk.dagger;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    /*@Inject
    SharedPreferences sharedPreferences;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //((App)getApplication()).getNetComponent().inject(this);
    }

    public void onClick(View vie){

    }
}
