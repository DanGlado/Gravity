package com.example.gravity.classes;

import com.example.gravity.generators.GeneratorBackground;
import com.example.gravity.objects.MainPlayer;
import com.example.my_framework.CoreFW;
import com.example.my_framework.GraphicsFW;

public class GameManager {
    private int maxScreenY;
    private int maxScreenX;
    private int minScreenY;
    private int minScreenX;

    MainPlayer mainPlayer;
    GeneratorBackground generatorBackground;
    public GameManager(CoreFW coreFW, int sceneWidth, int sceneHeight){
        this.maxScreenX=sceneWidth;
        this.maxScreenY=sceneHeight;
        minScreenX = 0;
        minScreenY = 0;
        mainPlayer = new MainPlayer(coreFW, maxScreenX, maxScreenY, minScreenY);
        generatorBackground=new GeneratorBackground(sceneWidth, sceneHeight);
    }

    public void update(){
        generatorBackground.update(mainPlayer.getSpeedPlayer());
        mainPlayer.update();
    }
    public void drawing(CoreFW coreFW, GraphicsFW graphicsFW){
        mainPlayer.drawing(graphicsFW);
        generatorBackground.drawing(graphicsFW);
    }
}
