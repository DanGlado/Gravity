package com.example.gravity.classes;

import com.example.my_framework.CoreFW;
import com.example.my_framework.GraphicsFW;
import com.example.gravity.utilits.UtilResource;

import java.util.ArrayList;

public class LoaderAssets {
    public LoaderAssets(CoreFW coreFW, GraphicsFW graphicsFW) {
        loadTexture(graphicsFW);
        loadSpritePlayer(graphicsFW);

    }

    private void loadSpritePlayer(GraphicsFW graphicsFW) {
        UtilResource.spritePlayer = new ArrayList<>();
        UtilResource.spritePlayerBoost = new ArrayList<>();

        UtilResource.spritePlayer.add(graphicsFW.newSprite(UtilResource.textureAtlas, 0, 0,
        64, 64));
        UtilResource.spritePlayer.add(graphicsFW.newSprite(UtilResource.textureAtlas, 64, 0,
                64, 64));
        UtilResource.spritePlayer.add(graphicsFW.newSprite(UtilResource.textureAtlas, 128, 0,
                64, 64));
        UtilResource.spritePlayer.add(graphicsFW.newSprite(UtilResource.textureAtlas, 192, 0,
                64, 64));

        UtilResource.spritePlayerBoost.add(graphicsFW.newSprite(UtilResource.textureAtlas, 0, 0,
                64, 64));
        UtilResource.spritePlayerBoost.add(graphicsFW.newSprite(UtilResource.textureAtlas, 64, 0,
                64, 64));
        UtilResource.spritePlayerBoost.add(graphicsFW.newSprite(UtilResource.textureAtlas, 128, 0,
                64, 64));
        UtilResource.spritePlayerBoost.add(graphicsFW.newSprite(UtilResource.textureAtlas, 192, 0,
                64, 64));
    }

    private void loadTexture(GraphicsFW graphicsFW) {
        UtilResource.textureAtlas = graphicsFW.newTexture("texture_atlas.png");
    }

}
