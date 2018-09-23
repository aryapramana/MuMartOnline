package com.software.tempe.mumartonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static String ACC_NAME = "Dohana Essensimo";

    // initialise all resource
    private TextView account_name_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        account_name_txt = findViewById(R.id.account_name_txt);

        account_name_txt.setText(ACC_NAME);

        // you can set all button click too
    }
}
