/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;
import Model.Student;

/**
 *
 * @author acer
 */
public class CarExam implements Exam{
    @Override
    public void startExam(Student student) {
        System.out.println("Student: " + student.studentName);
        System.out.println("Vehicle Exam: Car");
        if (student.getNumOfTrainingSession() >= 3 || student.getExamClearance()) {
            System.out.println("Status: Allowed to take exam");
        }else{
            System.out.println("Status: Not eligible for exam");
        }
    }
}
