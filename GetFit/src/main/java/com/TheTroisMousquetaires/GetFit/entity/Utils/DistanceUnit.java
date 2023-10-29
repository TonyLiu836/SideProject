package com.TheTroisMousquetaires.GetFit.entity;

public enum DistanceUnit {
    MILES(1, 1609.34, 1.60934),
    METERS(0.000621371, 1, 0.001);
    KILOMETERS(0.621371, 1000, 1);

    private final double toMilesConst;
    private final double toMetersConst;
    private final double toKilometersConst;
    DistanceUnit(double toMilesConst, double toMetersConst, double toKilometersConst){
        this.toMilesConst = toMilesConst;
        this.toMetersConst = toMetersConst;
        this.toKilometersConst = toKilometersConst;
    }

    public double toMiles(double dist){
        return dist * toMilesConst;
    }
    public double toMeters(double dist){
        return dist * toMetersConst;
    }
    public double toKilometers(double dist){
        return dist * toKilometersConst;
    }
}
