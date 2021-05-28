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
public class Student {
    private String name;
    private String studentID;

    public Student(String givenName){
        name = givenName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String newStudentID) {
        this.studentID = newStudentID;
    }
    
    
}
