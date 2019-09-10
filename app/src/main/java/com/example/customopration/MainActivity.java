package com.example.customopration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myutils.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int  a = MyMath.Plus(12,34);
        Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();
    }
}
