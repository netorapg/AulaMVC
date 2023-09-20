package com.coconut.gregory.model.diagram;

public class Coconut {
    private boolean good;
    private double weight;
    
    private Coconut() {
        super();
    }

    public Coconut(boolean good, double weight) {
        this();
        this.good = good;
        this.weight = weight;
    }
    
    public boolean isGood() {
        return this.good;
    }

    public boolean getGood() {
        return this.good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
}
