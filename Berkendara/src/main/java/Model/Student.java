/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author acer
 */
public class Student {
    public String studentName;
    private String studentNIK;
    private int numOfTrainingSession;
    private boolean examClearance;
    
    public Student(String studentName, String studentNIK, int numOfTrainingSession, boolean examClearance){
        this.studentName = studentName;
        this.studentNIK = studentNIK;
        this.numOfTrainingSession = numOfTrainingSession;
        this.examClearance = examClearance;
    }
    
    public Student(String studentName, String studentNIK){
        this.studentName = studentName;
        this.studentNIK = studentNIK;
        this.numOfTrainingSession = 0;
        this.examClearance = false;
    }
    
    public String getStudentNIK(){
        return this.studentNIK;
    }
    
    public int getNumOfTrainingSession(){
        return this.numOfTrainingSession;
    }
    
    public boolean getExamClearance(){
        return this.examClearance;
    }
    
    public void setExamClearance(boolean examClearance){
        this.examClearance = examClearance;
    }
    
    public void attendTrainingSession(){
        numOfTrainingSession++;
        System.out.println("Student " + studentName + " attended a training session");
        System.out.println("Current number of training session: " + numOfTrainingSession);
        if (numOfTrainingSession >= 3) {
            System.out.println("Please check for your eligibility status to take an exam");
        }
    }
    
    public void checkEligibilityForAnExam(){
        if (numOfTrainingSession >= 3 || examClearance) {
            System.out.println("Student " + studentName + ", now you can take an exam");
        }else{
            System.out.println("Student " + studentName + ", you still can't take an exam");
        }
    }
}
