package com.example.my_framework;

import android.graphics.Rect;

public abstract class ObjectFW {

    protected int maxScreenX;
    protected int maxScreenY;
    protected int minScreenX;
    protected int minScreenY;
    protected int x;
    protected int y;
    protected double speed;

    protected Rect hitbox;
    protected double radius;

    public int getMaxSceenX() {
        return maxScreenX;
    }

    public void setMaxSceenX(int maxSceenX) {
        this.maxScreenX = maxSceenX;
    }

    public int getMaxSceenY() {
        return maxScreenY;
    }

    public void setMaxSceenY(int maxSceenY) {
        this.maxScreenY = maxSceenY;
    }

    public int getMinSceenX() {
        return minScreenX;
    }

    public void setMinSceenX(int minSceenX) {
        this.minScreenX = minSceenX;
    }

    public int getMinSceenY() {
        return minScreenY;
    }

    public void setMinSceenY(int minSceenY) {
        this.minScreenY = minSceenY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Rect getHitbox() {
        return hitbox;
    }

    public void setHitbox(Rect hitbox) {
        this.hitbox = hitbox;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
