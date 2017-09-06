package com.scs.animationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout myRelLayout;
    private Animation animFadeIn;
    private Animation animFadeOut;
    private Animation animZoomIn;
    private Animation animZoomOut;
    private Animation animMotion;
    private Animation animRotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get id for relative layout
        myRelLayout = (RelativeLayout) findViewById(R.id.myLayout);

        //get id for all button
        Button btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
        Button btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
        Button btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
        Button btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
        Button btnMotion = (Button) findViewById(R.id.btnMotion);
        Button btnRotation = (Button) findViewById(R.id.btnRotation);

        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
        animMotion = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.motion);
        animRotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);

        //Create listener for btn Fade In
        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRelLayout.clearAnimation();
                myRelLayout.startAnimation(animFadeIn);
            }
        });

        //Create listener for btn fade Out
        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRelLayout.clearAnimation();
                myRelLayout.startAnimation(animFadeOut);
            }
        });

        //Create listener for btn Zoom In
        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRelLayout.clearAnimation();
                myRelLayout.startAnimation(animZoomIn);
            }
        });

        //Create listener for btn Zoom Out
        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRelLayout.clearAnimation();
                myRelLayout.startAnimation(animZoomOut);
            }
        });

        //Create listener for btn Motion
        btnMotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRelLayout.clearAnimation();
                myRelLayout.startAnimation(animMotion);
            }
        });

        //Create listener for btn Rotation
        btnRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRelLayout.clearAnimation();
                myRelLayout.startAnimation(animRotation);
            }
        });
    }
}
