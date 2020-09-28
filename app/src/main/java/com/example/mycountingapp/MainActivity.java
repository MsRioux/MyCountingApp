package com.example.mycountingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "-----------This is a message in the log----------");
        Log.e("error", "------------Ooh, that's an error----------");
        Log.w("warning", "-----------You want to be careful with that--------------");
        Log.wtf("What a Terrible Failure", "------------------That one is REALLY BAD----------------");

        Toast.makeText(this, "Your toast is ready!",Toast.LENGTH_LONG).show();
    }

    public void onClickFirstButton(View view)
    {
        Toast.makeText(this,"You clicked the first button", Toast.LENGTH_LONG).show();
    }

    public void onClickSecondButton(View view)
    {
        Toast.makeText(this,"You clicked the second button like a PRO!!", Toast.LENGTH_SHORT).show();
    }

}