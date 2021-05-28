/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Kiu So
 */
public class StudentList {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] students = new Student[5];
        
        students[0] = new Student("Kiu");
        students[1] = new Student("Sanvir");
        students[2] = new Student("Liz");
        students[3] = new Student("Chris");
        students[4] = new Student("William");
        
        for (Student s: students){
            System.out.println(s.getName());
        }
    }
    
}
