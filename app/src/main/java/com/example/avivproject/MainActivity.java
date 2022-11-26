package com.example.avivproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectHeroListener{
    RecyclerView recyclerView;
    List<MyModel> myModelList;
    CustomAdapter customAdapter;
    HeroModel heroModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayHeroes();
    }

    private void displayHeroes() {
        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myModelList = new ArrayList<>();
        myModelList.add(new MyModel("Captain America","Steve Rogers",R.drawable.captainamerica));
        myModelList.add(new MyModel("Iron Man","Tony Stark",R.drawable.ironman));
        myModelList.add(new MyModel("Thor","Thor",R.drawable.thor));
        myModelList.add(new MyModel("Spider-Man","Peter Parker",R.drawable.spiderman));
        customAdapter = new CustomAdapter(this,myModelList,this);
        recyclerView.setAdapter(customAdapter);

    }

    @Override
    public void onHeroClick(MyModel myModel) {
        Intent intent = new Intent(MainActivity.this, HeroActivity.class);
        intent.putExtra("Hero_image",myModel.getImage());
        intent.putExtra("Hero_info",myModel.getName());
        startActivity(intent);
//        Toast.makeText(this,myModel.getImage(),Toast.LENGTH_LONG).show();
    }
}