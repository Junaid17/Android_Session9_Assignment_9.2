package com.example.jmush.android_session9_assignment_92;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0, "Computer");
        menu.add(0,1,1, "Gamepad");
        menu.add(0,2,2, "Camera");
        menu.add(0,3,3, "Video");
        menu.add(0,4,4, "Email");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getTitle()=="Computer"){
            Toast.makeText(MainActivity.this,"computer Clicked",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Gamepad"){
            Toast.makeText(MainActivity.this,"gamepad Clicked",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Camera"){
            Toast.makeText(MainActivity.this,"camera Clicked",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Video"){
            Toast.makeText(MainActivity.this,"video Clicked",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Email"){
            Toast.makeText(MainActivity.this,"camera Clicked",Toast.LENGTH_LONG).show();
        }


        return true;

    }
}
