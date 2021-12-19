package com.example.my_framework;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Date;

public class LoopFW extends SurfaceView implements Runnable{

    private final float FPS = 60;  // Сколько раз обновляем игру в секунду
    private final float SECOND = 1000000000;  // вспомогат. константа
    private final float UPDATE_TIME = SECOND / FPS;  // Время, через сколько нужно сделать апдейта

    private boolean running = false;

    Thread gameThread = null;
    CoreFW coreFW;
    Bitmap frameBuffer;
    SurfaceHolder surfaceHolder;
    Canvas canvas;
    Rect rect;

    public LoopFW(CoreFW coreFW, Bitmap frameBuffer){
        super(coreFW);
        this.frameBuffer = frameBuffer;
        this.coreFW = coreFW;
        this.surfaceHolder = getHolder();
        rect = new Rect();
        canvas = new Canvas();
    }

    //TEMP
    float updates = 0;
    float drawing = 0;
    long timer = 0;
    //TEMP


    @Override
    public void run() {

        float lastTime = System.nanoTime();
        float delta = 0;
        timer = System.currentTimeMillis();

        while (running){
            float nowTime = System.nanoTime();
            float elapsedTime = nowTime - lastTime;
            lastTime = nowTime;  // время одного loop
            delta += elapsedTime/UPDATE_TIME;

            if (delta>1){
                updateGame();
                drawingGame();
                delta--;
            }
            if (System.currentTimeMillis()-timer>1000){  // Если тек. время в миллисекундах - timer > 1 сек
                Date date = new Date();
                System.out.println("UPDATES = "+updates + " DRAWING " + drawing + " "+ date.toString());
                updates = 0;
                drawing = 0;
                timer += 1000;
            }
        }

    }

    private void updateGame(){
        updates++;
        coreFW.getCurrentScene().update();
    }

    private void drawingGame(){
        drawing++;
        if (surfaceHolder.getSurface().isValid()){
            canvas = surfaceHolder.lockCanvas();
            canvas.getClipBounds();
            canvas.drawBitmap(frameBuffer, null, rect, null);
            coreFW.getCurrentScene().drawing();
            surfaceHolder.unlockCanvasAndPost(canvas);
        }
    }

    public void startGame(){  // public - будем обращаться из других классов
        if (running){  // Если запущена игра, то ок
            return;
        }
        running = true;  // Запускаем игру
        gameThread = new Thread(this);  // Создаем поток (this - запускаем run())
        gameThread.start();
    }



    public void stopGame() throws InterruptedException {  // Может быть исключение IE
        if (!running){
            return;
        }
        running = false;

        gameThread.join();
    }
}
