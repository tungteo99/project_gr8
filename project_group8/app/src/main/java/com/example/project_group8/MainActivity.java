package com.example.project_group8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button BT1, BT2, BT3, BT4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BT1 = (Button) findViewById(R.id.BtnPlay);
        BT2 = (ImageButton) findViewById(R.id.BtnTutorial);
        BT3 = (Button) findViewById(R.id.BtnBack);

        //BT1.setOnClickListener(new View.OnClickListener() {
           /* @Override
            public void onClick(View v) {
                //Sử dụng Intent để mở activity banhcanh
                Intent intent = new Intent(MainActivity.this, banhcanh.class);
                startActivity(intent);
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, chaoluon.class);
                startActivity(intent);
            }
        });*/
    }
}