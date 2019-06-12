package com.example.myapplication7;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button fab = findViewById(R.id.button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast to=Toast.makeText(getApplicationContext(),"바나나",Toast.LENGTH_LONG);
                to.show();

            }
        });
        final Button fab1 = findViewById(R.id.button2);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fab1.setText("사과");
                TextView text= findViewById(R.id.textView);
                if(text.getText().equals("가즈아")){
                    text.setText("hello");
                }else{
                    text.setText("가즈아");
                }
                Toast to=Toast.makeText(getApplicationContext(),"사과",Toast.LENGTH_LONG);
                to.show();

            }
        });
        Button fab2 = findViewById(R.id.button3);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast to=Toast.makeText(getApplicationContext(),"고양이",Toast.LENGTH_LONG);
                to.show();

            }
        });
        Button fab3 = findViewById(R.id.button4);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast to=Toast.makeText(getApplicationContext(),"korea",Toast.LENGTH_LONG);
                to.show();

            }
        });
        Button fab4 = findViewById(R.id.button5);
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast to=Toast.makeText(getApplicationContext(),"개",Toast.LENGTH_LONG);
                to.show();

            }
        });
        Button fab5 = findViewById(R.id.button6);
        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast to=Toast.makeText(getApplicationContext(),"포크",Toast.LENGTH_LONG);
                to.show();

            }
        });
        Button fab6 = findViewById(R.id.button7);
        fab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast to=Toast.makeText(getApplicationContext(),"골프",Toast.LENGTH_LONG);
                to.show();

            }
        });
        Button fab7 = findViewById(R.id.button8);
        fab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast to=Toast.makeText(getApplicationContext(),"말",Toast.LENGTH_LONG);
                to.show();

            }
        });
        Button fab8 = findViewById(R.id.button9);
        fab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast to=Toast.makeText(getApplicationContext(),"얼음",Toast.LENGTH_LONG);
                to.show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
