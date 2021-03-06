package com.example.gravity.objects;

import com.example.my_framework.ObjectFW;
import com.example.my_framework.utilits.UtilRandomFW;

public class Star extends ObjectFW {
    public Star(int sceneWidth, int sceneHeight) {
        this.maxScreenX=sceneWidth;
        this.maxScreenY=sceneHeight;
        this.minScreenX=0;
        this.minScreenY=0;
        this.speed = 4;
        this.x = UtilRandomFW.getCasualNumber(maxScreenX);
        this.y = UtilRandomFW.getCasualNumber(maxScreenY);

    }

    public void update(double speedPlayer){
        x-=speedPlayer;
        x-=speed;
        if (x<0){
            x=maxScreenX;
            UtilRandomFW.getCasualNumber(maxScreenY);
        }
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
