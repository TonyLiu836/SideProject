package com.TheTroisMousquetaires.GetFit.entity.Utils;

public enum WeightUnit {
    POUNDS(1, 0.453592),
    KILOGRAMS(2.20462, 1);

    private final double toPoundsConst;
    private final double toKilogramsConst;

    WeightUnit(double toPoundsConst, double toKilogramsConst){
        this.toPoundsConst = toPoundsConst;
        this.toKilogramsConst = toKilogramsConst;
    }
    public double toPounds(double weight){
        return weight * toPoundsConst;
    }
    public double toKilograms(double weight){
        return weight * toKilogramsConst;
    }
}
