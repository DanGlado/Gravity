package com.example.gravity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gravity.classes.LoaderAssets;
import com.example.gravity.scenes.MainMenuScene;
import com.example.my_framework.CoreFW;
import com.example.my_framework.LoopFW;
import com.example.my_framework.SceneFW;

public class Main extends CoreFW {

    public SceneFW getStartScene() {
        LoaderAssets loaderAssets = new LoaderAssets(this, this.getGraphicsFW());
        return new MainMenuScene(this);

    }
}