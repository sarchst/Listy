package com.example.sarch.listy;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sarch.listy.db.TaskContract;
import com.example.sarch.listy.db.TaskDbHelper;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private static final String TAG = "MainActivity";

    private static int SPLASH_TIME_OUT = 4000;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // sets the view of this activity


        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);

       /* button = (Button) findViewById(R.id.first_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity2();
            }
        });*/

    }







    /*    // starts the other activity
        public void OpenActivity2() {
            Intent intent= new Intent(this, Main2Activity.class);
            startActivity(intent);

        }*/
    }

