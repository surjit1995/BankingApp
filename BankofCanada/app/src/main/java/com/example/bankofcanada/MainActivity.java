package com.example.bankofcanada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnsignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsignin=findViewById(R.id.signin);
        btnsignin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent act = new Intent(getApplicationContext(), WelcomeActivity.class);
        startActivity(act);
    }
}
