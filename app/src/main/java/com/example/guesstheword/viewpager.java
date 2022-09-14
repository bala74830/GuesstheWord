package com.example.guesstheword;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class viewpager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        getSupportActionBar().hide();
         ViewPageAdapter viewPageAdapter;
        ViewPager viewPager = findViewById(R.id.viewpager);
        DotsIndicator dotsIndicator=findViewById(R.id.dots_indicator);

        viewPageAdapter=new ViewPageAdapter(getSupportFragmentManager());

        viewPageAdapter.add(new Page1());
        viewPageAdapter.add(new Page2());
        viewPageAdapter.add(new Page3());
        viewPageAdapter.add(new Page4());
        viewPageAdapter.add(new Page5());
        viewPager.setAdapter(viewPageAdapter);
        dotsIndicator.setViewPager(viewPager);
    }
}