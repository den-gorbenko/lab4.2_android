package com.example.lab4_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = Fragment1.newInstance();
        fragment2 = Fragment2.newInstance();
        fragment3 = Fragment3.newInstance();

        manager = getSupportFragmentManager();

        findViewById(R.id.YT).setOnClickListener(view -> {
            // start of transaction
            FragmentTransaction transaction = manager.beginTransaction();
            // changing fragments
            transaction.replace(R.id.container, fragment1);
            transaction.commit();
        });

        findViewById(R.id.GT).setOnClickListener(view -> {
            // start of transaction
            FragmentTransaction transaction = manager.beginTransaction();
            // changing fragments
            transaction.replace(R.id.container, fragment2);
            transaction.commit();
        });

        findViewById(R.id.GH).setOnClickListener(view -> {
            // start of transaction
            FragmentTransaction transaction = manager.beginTransaction();
            // changing fragments
            transaction.replace(R.id.container, fragment3);
            transaction.commit();
        });

    }
}
