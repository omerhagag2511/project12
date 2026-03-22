package com.example.project12;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    ImageView iv;
    Switch swDN;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.Tb);
        swDN = (Switch) findViewById(R.id.swDN);
        iv = (ImageView) findViewById(R.id.iv);
    }
    public void goToggle(View v) {
        if (tb.isChecked()) {

        } else {

        }
    }
}
