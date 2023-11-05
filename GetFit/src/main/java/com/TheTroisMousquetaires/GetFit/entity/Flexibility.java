package com.TheTroisMousquetaires.GetFit.entity;
import java.time.Duration;

public class Flexibility implements IExerciseEvent {
    private String name;

    public Flexibility(String name) {
        this.name = name;
    }

    // Implement the methods from the IExerciseEvent interface
    @Override
    public Duration getDuration() {
        // Flexibility exercises typically do not have a duration, so return a default value
        return Duration.ZERO;
    }

    @Override
    public void setDuration(Duration duration) {
        // Flexibility exercises typically do not have a duration, so do nothing
    }

    @Override
    public String getAdditionalNotes() {
        // You can add additional notes specific to this flexibility exercise here
        return "0";
    }

    @Override
    public void setAdditionalNotes(String additionalNotes) {
        // You can set additional notes specific to this flexibility exercise here
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
      return  "Exercise name: " + name;
    }
}