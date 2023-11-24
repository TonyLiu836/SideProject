package com.TheTroisMousquetaires.GetFit.entity;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Flexibility implements IExerciseEvent {
    private String name;
    private Duration duration;
    private String additionalNotes;

    public Flexibility(String name) {
        this.name = name;
        this.additionalNotes = "";
    }

    // Implement the methods from the IExerciseEvent interface
    @Override
    public Duration getDuration() {
        // Flexibility exercises typically do not have a duration, so return a default value
        return this.duration;
    }

    @Override
    public void setDuration(Duration duration) {
        // Flexibility exercises typically do not have a duration, so do nothing
        this.duration = duration;
    }

    @Override
    public String getAdditionalNotes() {
        // You can add additional notes specific to this flexibility exercise here
        return this.additionalNotes;
    }

    @Override
    public void setAdditionalNotes(String additionalNotes) {
        // You can set additional notes specific to this flexibility exercise here
        this.additionalNotes = additionalNotes;
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
      return  "Exercise name: " + name + ", Duration: " + duration.toString();
    }
}