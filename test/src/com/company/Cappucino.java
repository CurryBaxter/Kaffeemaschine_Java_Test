package com.company;

public class Cappucino extends Kaffeesorte {
    public Cappucino(){
        super(6);
    }

    @Override
    public double getbohnenverbrauch() {
        return this.bohnenverbrauch;
    }

    @Override
    public void setbohnenverbrauch( double neuerVerbrauch) {

    }
}
