package com.example.avivproject;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HeroActivity extends AppCompatActivity {
    Button button;
    ImageView image;
    TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_info);
        button = findViewById(R.id.backbutton);
        Intent intent=getIntent();
        image =  findViewById(R.id.heroImage1);
        info =  findViewById(R.id.heroInfo1);
        image.setImageResource(intent.getExtras().getInt("Hero_image"));
        info.setText(intent.getStringExtra("Hero_info"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HeroActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
