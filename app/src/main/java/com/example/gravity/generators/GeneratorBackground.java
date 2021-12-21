package com.example.gravity.generators;

import android.graphics.Color;

import com.example.gravity.objects.Star;
import com.example.my_framework.GraphicsFW;

import java.util.ArrayList;

public class GeneratorBackground {
    public ArrayList<Star> starArrayList=new ArrayList<Star>();


    public GeneratorBackground(int sceneWidth, int sceneHeight) {
        int starsSpeak = 50;
        for (int i = 0; i < starsSpeak; i++){
            Star star = new Star(sceneWidth, sceneHeight);
            starArrayList.add(star);
        }

    }

    public void update(){
        for (int i = 0; i <starArrayList.size(); i++){
            starArrayList.get(i).update();
        }
    }

    public void drawing(GraphicsFW graphicsFW){
        for (int i = 0; i < starArrayList.size(); i++){
            graphicsFW.drawPixel(starArrayList.get(i).getX(),
                    starArrayList.get(i).getY(), Color.WHITE);
        }
    }


}
