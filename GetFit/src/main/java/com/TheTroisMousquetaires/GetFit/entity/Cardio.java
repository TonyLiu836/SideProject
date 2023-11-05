package com.TheTroisMousquetaires.GetFit.entity;
import java.time.Duration;
import com.TheTroisMousquetaires.GetFit.entity.Utils.DistanceUnit;

public class Cardio implements IExerciseEvent {
    private String name;
    private double distance;
    private DistanceUnit unit;
    private Duration duration;

    public Cardio(String name, double distance, DistanceUnit unit, Duration duration) {
        this.name = name;
        this.distance = distance;
        this.unit = unit;
        this.duration = duration;
    }

    // Implement the methods from the IExerciseEvent interface
    @Override
    public Duration getDuration() {
        return this.duration;
    }

    @Override
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String getAdditionalNotes() {
       return "0";
    }

    @Override
    public void setAdditionalNotes(String additionalNotes) {
    }

    // Getter and Setter for name
    public String getName() {
      return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for distance
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Exercise name: " + name + ", Distance: " + distance + " " + unit;
    }

}
