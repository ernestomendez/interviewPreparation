package com.dxesoft.exercices.gasStation;

public class GasPump {

    int fuel;
    boolean isServing;
    int timeElapsed;

    public GasPump(int fuel) {
        this.fuel = fuel;
        this.isServing = false;
        this.timeElapsed = 0;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public boolean isServing() {
        return isServing;
    }

    public void setServing(boolean serving) {
        isServing = serving;
    }

    public int getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed += timeElapsed;
    }
}
