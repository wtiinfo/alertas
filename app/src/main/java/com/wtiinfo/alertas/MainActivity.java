package com.wtiinfo.alertas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {
        new MyDialogFragment().show(getSupportFragmentManager(), "dialog");
    }

    public void openSimple(View view) {
        new SimpleDialogFragment().show(getSupportFragmentManager(), "simple");
    }

    public void openRadio(View view) {
        new RadioDialogFragment().show(getSupportFragmentManager(), "radio");
    }

    public void openMulti(View view) {
        new MultiDialogFragment().show(getSupportFragmentManager(), "multiple");
    }
}