package com.example.abhiroop.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView count;
    Button inc,dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = findViewById(R.id.count);
        inc = findViewById(R.id.inc);
        dec = findViewById(R.id.dec);

        inc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                count.setText(String.valueOf(Integer.parseInt(count.getText().toString())+1));
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                count.setText(String.valueOf(Integer.parseInt(count.getText().toString())-1));
            }
        });

    }
}
