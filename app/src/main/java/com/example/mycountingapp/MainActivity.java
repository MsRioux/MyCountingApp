package com.example.mycountingapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "-----------This is a message in the log----------");
        Log.e("error", "------------Ooh, that's an error----------");
        Log.w("warning", "-----------You want to be careful with that--------------");
        Log.wtf("What a Terrible Failure", "------------------That one is REALLY BAD----------------");

        //Toast.makeText(this, "Your toast is ready!",Toast.LENGTH_LONG).show();
    }

    public void onClickFirstButton(View view)
    {
        num1++;
        TextView introTextView = (TextView) findViewById(R.id.introTV);// the introTV is the name of the TV to be updated
        introTextView.setText("You now have " + num1 + " fishies.");
       // Toast.makeText(this,"You clicked the first button", Toast.LENGTH_LONG).show();
    }

    public void onClickSecondButton(View view)
    {
        num1--;
        TextView introTextView = (TextView) findViewById(R.id.introTV);// the introTV is the name of the TV to be updated
        introTextView.setText("You now have " + num1 + " fishies.");
        //Toast.makeText(this,"You clicked the second button like a PRO!!", Toast.LENGTH_SHORT).show();
    }

    public void onClickGoToScnTwo (View view)
    {
        startActivity(new Intent(MainActivity.this, Screen2.class));
    }
 /*
    public void openDialogue(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm reset count");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this, "yessiree", Toast.LENGTH_LONG).show();

            }
        })
    }

  */


}