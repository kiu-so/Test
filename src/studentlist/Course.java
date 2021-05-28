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
public class Course {
    String name;
    int ID;
    String [] students = new String[20];
    private int nbrOfStudents = 0;
    
    public Course(){
    }
    
    public Course(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public int getNbrOfStudents(){
        return nbrOfStudents;
    }
    
    void addStudent(String name){
        students[nbrOfStudents] = name;
        ++nbrOfStudents;
    }
    
    String[] getStudentList(){
        return students;
    }
    
    @Override
    public String toString(){
        return "Course{" + "name";
    }
}
