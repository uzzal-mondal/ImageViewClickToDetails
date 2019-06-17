package com.example.fastpart;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text1, text2;
    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.uzzalImgae_id);
        img2 = findViewById(R.id.logoImage_id);
        text1 = findViewById(R.id.textid);
        text2 = findViewById(R.id.textid2);


        img1.setOnClickListener(this);
        img2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.uzzalImgae_id) {

            String name = text1.getText().toString();

            Intent intent = new Intent(MainActivity.this, BioData.class);
            intent.putExtra("key", name);
            startActivity(intent);

            Toast.makeText(this, "uzzal", Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.logoImage_id) {

            String data = text2.getText().toString();
            Intent intent1 = new Intent(MainActivity.this, BioData.class);
            intent1.putExtra("keyres", data);
            startActivity(intent1);

            Toast.makeText(this, "logo", Toast.LENGTH_SHORT).show();
        }


    }
}



