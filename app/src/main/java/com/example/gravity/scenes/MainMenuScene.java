package com.example.gravity.scenes;

import android.graphics.Color;

import com.example.gravity.R;
import com.example.my_framework.CoreFW;
import com.example.my_framework.SceneFW;


public class MainMenuScene extends SceneFW{

    public MainMenuScene(CoreFW coreFW) {
        super(coreFW);
    }

    @Override
    public void update() {
        if (coreFW.getTouchListenerFW().getTouchUp(50, 300, 100, 50)){
            coreFW.setScene(new GameScene(coreFW));
        }
    }

    @Override
    public void drawing() {
        graphicsFW.clearScene(Color.BLACK);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_nameGame), 200, 100, Color.BLUE, 70, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_newGame), 40, 300, Color.BLUE, 50, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_settings), 40, 400, Color.BLUE, 50, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_leaders), 40, 450, Color.BLUE, 50, null);
        graphicsFW.drawText(coreFW.getString(R.string.txt_mainMenu_exitGame), 40, 500, Color.BLUE, 50, null);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
