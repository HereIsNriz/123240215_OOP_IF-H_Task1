/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nriz.berkendara;
import Model.*;
import Vehicles.*;
import Exam.*;

/**
 *
 * @author acer
 */
public class Berkendara {

    public static void main(String[] args) {
        Student student1 = new Student("Naufal", "123240215");
        Student student2 = new Student("Adhafa", "123240069");
        Student student3 = new Student("Dimas", "123240110");
        
        Instructor instructor1 = new Instructor("Novrido", "999999999");
        
        System.out.println("Start all vehicles engine...");
        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "123456", 5);
        Car car1 = new Car("Toyota", "456789", 20);
        Bus bus1 = new Bus("Hino", "987654321", 200);
        
        motorcycle1.turnMachineOn();
        motorcycle1.horn();
        car1.turnMachineOn();
        car1.horn();
        bus1.turnMachineOn();
        bus1.horn();
        System.out.println("");
        
        MotorcycleExam mE = new MotorcycleExam();
        CarExam cE = new CarExam();
        BusExam bE = new BusExam();
        
        // Starting scenario
        
        // Scenario number 1
        // A student completes 3 training sessions and attempts an exam
        student1.attendTrainingSession();
        student1.attendTrainingSession();
        student1.attendTrainingSession();
        student1.checkEligibilityForAnExam();
        System.out.println("");
        mE.startExam(student1);
        System.out.println("");
        
        // Scenario number 2
        // A student attempts an exam with insufficient sessions
        student2.attendTrainingSession();
        student2.checkEligibilityForAnExam();
        System.out.println("");
        cE.startExam(student2);
        System.out.println("");
        
        // Scenario number 3
        // A student receives instructor clearance and then attempts an exam
        student3.attendTrainingSession();
        student3.checkEligibilityForAnExam();
        instructor1.giveExamClearance(student3);
        student3.checkEligibilityForAnExam();
        System.out.println("");
        bE.startExam(student3);
    }
}
