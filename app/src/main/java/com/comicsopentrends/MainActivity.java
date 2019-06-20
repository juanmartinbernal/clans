package com.comicsopentrends;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.comicsopentrends.fragments.mvp.characteres.view.impl.CharactersFragmentImpl;
import com.comicsopentrends.util.Utils;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Utils.replaceFragment(new CharactersFragmentImpl(), R.id.charactersFragment,getSupportFragmentManager());
    }
}
