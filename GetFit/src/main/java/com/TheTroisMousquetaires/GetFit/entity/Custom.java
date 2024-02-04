package com.TheTroisMousquetaires.GetFit.entity;
import java.time.Duration;
import com.TheTroisMousquetaires.GetFit.entity.Utils.DistanceUnit;

public class Custom implements IExerciseEvent {
    private String name;
    private double distance;
    private DistanceUnit unit;
    private double weight;
    private int reps;
    private Duration duration;
    private String additionalNotes;

    public Custom(String name, double distance, DistanceUnit unit, double weight, int reps, Duration duration) {
        this.name = name;
        this.distance = distance;
        this.unit = unit;
        this.weight = weight;
        this.reps = reps;
        this.duration = duration;
        this.additionalNotes = "";
    }

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
        return additionalNotes;
    }

    @Override
    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
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

    // Getter and Setter for unit
    public DistanceUnit getUnit() {
        return unit;
    }

    public void setUnit(DistanceUnit unit) {
        this.unit = unit;
    }

    // Getter and Setter for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter and Setter for reps
    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    @Override
    public String toString() {
        return "CustomExercise" +
               "name:" + name;
    }
}