// students table --
// id(int PK auto increment),
// name(varchar),
// email(varchar) unique,
// address(varchar),
// dob(date),
// marks(int),
// course_id(int FK --references courses table)

package com.app.pojo;

public class Student {

    private Integer id;
    private String name;
    private String email;
    private String address;
    private LocalDate dob;
    private Integer marks;
    private Integer courseId;

    public Student() {
    }

    public Student(String name, String email, String address, Integer marks, Integer courseId) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.marks = marks;
        this.courseId = courseId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Student [address=" + address + ", courseId=" + courseId + ", email=" + email + ", id=" + id + ", marks="
                + marks + ", name=" + name + "]";
    }

}