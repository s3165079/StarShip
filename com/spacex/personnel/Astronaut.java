// Astronaut.java
// D. Singletary 
// 3/20/23
// class representing an astronaut

// D. Locke
// 8/11/2023
// added duration of mission and time of departure with seperate date formatter

package com.spacex.personnel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.time.Period;

public class Astronaut {
   private String name;
   private double heightCm;  // height in centimeters
   private double weightKg;  // weight in kilograms
   private LocalDateTime timeOfArrival; // time astronaut arrived on station
   private Period missionPeriod; // length of mission
   private LocalDate timeOfDeparture; // time astronaut departed station
   
   // overload, create an astronaut with specified name, height, and weight
   public Astronaut(String name, double heightCm, double weightKg,
                     LocalDateTime timeOfArrival, Period missionPeriod, LocalDate timeOfDeparture) {    
      this.name = name;
      this.heightCm = heightCm;
      this.weightKg = weightKg;
      this.timeOfArrival = timeOfArrival;
      this.missionPeriod = missionPeriod;
      this.timeOfDeparture = timeOfDeparture;
   }
   
   public String toString() {
      DecimalFormat decFormatter = new DecimalFormat(".#");
      DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("YYYY/MM/dd HH:mm:ss");
      DateTimeFormatter dFormatter = DateTimeFormatter.ofPattern("YYYY/MM/dd");
      
      return "name: " + name + "\n" + 
               "height: " + decFormatter.format(heightCm) + " (cm)\n" +
               "weight: " + decFormatter.format(weightKg) + " (kg)\n" +
               "arrival: " + dtFormatter.format(timeOfArrival) + "\n" +
               "stay length: " + missionPeriod.getDays() + " days\n" +
               "est. return: " + dFormatter.format(timeOfDeparture) + "\n";
   }
}

