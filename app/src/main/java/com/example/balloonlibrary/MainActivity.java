package com.example.balloonlibrary;

//https://github.com/skydoves/Balloon
//https://www.youtube.com/watch?v=uoV17usLk-Y&list=PLbqix4Yb1xFLjoMSOBNn65Iqys2lsvZ8w&index=1


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.skydoves.balloon.ArrowOrientation;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAnimation;
import com.skydoves.balloon.IconForm;
import com.skydoves.balloon.TextForm;

public class MainActivity extends AppCompatActivity {
    private Button oneBtn,twoBtn,threeBtn;
    private Context context;
    private Balloon balloonOne,balloonTwo,balloonThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        TextForm textForm = new TextForm.Builder(context)
                .setText("This is a TextForm")
                .setTextColorResource(R.color.colourWhite)
                .setTextSize(14f)
                .setTextTypeface(Typeface.BOLD)
                .build();

        IconForm iconForm = new IconForm.Builder(context)
                .setDrawable(ContextCompat.getDrawable(context, R.drawable.ic_edit_black_24dp))
                .setIconColor(ContextCompat.getColor(context, R.color.colourBlack))
                .setIconSize(50)
                .build();

        balloonOne = new Balloon.Builder(context)
                .setArrowSize(10)
                .setArrowOrientation(ArrowOrientation.BOTTOM)
                .setArrowVisible(true)
                .setWidthRatio(1.0f)
                .setHeight(65)
                .setTextSize(15f)
                .setArrowPosition(0.5f)
                .setCornerRadius(4f)
                .setAlpha(0.9f)
                .setText("This is simple Baloon Message")
                .setTextColor(ContextCompat.getColor(context, R.color.colourWhite))
                .setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .setBalloonAnimation(BalloonAnimation.FADE)
                .setTextForm(textForm)
                .build();

        balloonTwo = new Balloon.Builder(context)
                .setArrowSize(10)
                .setArrowOrientation(ArrowOrientation.LEFT)
                .setArrowVisible(true)
                .setWidthRatio(.6f)
                .setHeight(65)
                .setTextSize(15f)
                .setArrowPosition(0.5f)
                .setCornerRadius(4f)
                .setAlpha(0.9f)
                .setText("This is simple Baloon Message")
                .setTextColor(ContextCompat.getColor(context, R.color.colourWhite))
                .setBackgroundColor(ContextCompat.getColor(context, R.color.colourLightBlue))
                .setBalloonAnimation(BalloonAnimation.CIRCULAR)
                .setIconDrawable(ContextCompat.getDrawable(context, R.drawable.ic_edit_black_24dp))
                .setIconForm(iconForm)
                .build();

        balloonThree = new Balloon.Builder(context)
                .setArrowSize(10)
                .setArrowOrientation(ArrowOrientation.BOTTOM)
                .setArrowVisible(true)
                .setWidthRatio(.6f)
                .setHeight(65)
                .setTextSize(15f)
                .setArrowPosition(0.5f)
                .setCornerRadius(4f)
                .setAlpha(0.9f)
                .setText("This is simple Baloon Message")
                .setTextColor(ContextCompat.getColor(context, R.color.colourWhite))
                .setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .setBalloonAnimation(BalloonAnimation.FADE)
                .setTextForm(textForm)
                .build();




        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balloonOne.showAlignTop(oneBtn);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        balloonOne.dismiss();
                    }
                },2000);

            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                balloonTwo.showAlignRight(twoBtn);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                       balloonTwo.dismiss();
                    }
                },2000);
            }
        });


    }

    private void init() {
        oneBtn = findViewById(R.id.clickBtnOne);
        twoBtn = findViewById(R.id.clickBtnTwo);
        threeBtn = findViewById(R.id.clickBtnThree);
        context = getApplicationContext();

    }
}
