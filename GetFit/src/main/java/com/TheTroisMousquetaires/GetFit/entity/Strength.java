package com.TheTroisMousquetaires.GetFit.entity;
import java.time.Duration;

import com.TheTroisMousquetaires.GetFit.entity.Utils.WeightUnit;

public class Strength implements IExerciseEvent {
    private String name;
    private double weight;
    private int reps;
    private Duration duration;
    private WeightUnit weightUnit;
    private String additionalNotes;

    public Strength(String name, double weight, int reps, Duration duration, WeightUnit weightUnit) {
        this.name = name;
        this.weight = weight;
        this.reps = reps;
        this.duration = duration;
        this.weightUnit = weightUnit;
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
        return this.additionalNotes;
    }

    @Override
    public void setAdditionalNotes(String additionalNotes) {
       
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    @Override
    public String toString() {
      return "Exercise name: " + name + ", Weight: " + weight + weightUnit.toString() + ", Reps: " + reps;
    }
}