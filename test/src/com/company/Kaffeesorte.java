package com.company;

abstract class Kaffeesorte {
    protected double bohnenverbrauch;


    protected Kaffeesorte(double _bohnenverbrauch) {
    this.bohnenverbrauch = _bohnenverbrauch;
    }

    public double getbohnenverbrauch(){
        return this.bohnenverbrauch;
    }
    public void setbohnenverbrauch( double neuerVerbrauch){
        this.bohnenverbrauch = neuerVerbrauch;
    }
}
