package com.example.fastpart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BioData extends AppCompatActivity {

    private TextView text, textt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_data);

        text = findViewById(R.id.textViewNew_id);
        textt = findViewById(R.id.textViewPure_id);


        Intent intent = getIntent();
        String message  =  intent.getStringExtra("key");
        text.setText(message);


         /* new image click data..*/
        Intent intent1 = getIntent();
        String data = intent.getStringExtra("keyres");
        textt.setText(data);



    }
}
