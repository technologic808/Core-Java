package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.app.util.DBUtils;

/**
 * Dao
 */
public class Dao implements IDao {

    private Connection cn;
    private PreparedStatement pst1, pst2, pst3, pst4, pst5;

    public Dao() {
        cn = com.app.util.DBUtils.fetchConnection();
        pst1 = cn.prepareStatement("select name, email, ")
    }

    // 1. Display student details for a specific course name
    // i/p --course name
    // o/p -- matched student details

    public List<Student> getStudentDetails(String courseName) {
        return null;
    }

    // 2. Student admission
    // i/p --student details
    // name,email,address,dob,course_id or still better course name
    // o/p status message --student admission success / failed

    public String admitStudent(Student student, String courseName) {
        return null;
    }

    // 3. Display topper details for a specific course
    // i/p --course id or course name
    // o/p --topper details

    public Student getTopperDetails(String courseName) {
        return null;
    }

    // 4. Cancel Admission
    // i/p student id
    // o/p status message --student admission cancelled / failed

    public String cancelAdmission(Integer studentId) {
        return null;
    }

    // 5. Update marks
    // i/p student id , marks
    // o/p status message --student's ,marks updated / failed

    public String updateMarks(Integer studentId, Double newMarks) {
        return null;
    }

}