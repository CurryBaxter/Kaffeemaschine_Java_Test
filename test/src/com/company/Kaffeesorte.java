package com.company;

abstract class Kaffeesorte {
    protected double bohnenverbrauch;
    protected boolean milkrequired;


    protected Kaffeesorte(double _bohnenverbrauch, boolean _milkrequired) {
    this.bohnenverbrauch = _bohnenverbrauch;
    this.milkrequired = _milkrequired;
    }

    public double getbohnenverbrauch(){
        return this.bohnenverbrauch;
    }
    public void setbohnenverbrauch( double neuerVerbrauch){
        this.bohnenverbrauch = neuerVerbrauch;
    }
}
