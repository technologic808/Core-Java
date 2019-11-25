// courses table --
// course_id(int PK auto increment),
// name(unique),
// fees(double),
// strt_date,
// end_date(date)

package com.app.pojo;

import java.time.LocalDate;

public class Course {
    private Integer course_id;
    private String name;
    private Double fees;
    private LocalDate strt_date, end_date;

    public Course() {
    }

    public Course(String name, Double fees, LocalDate strt_date, LocalDate end_date) {
        this.name = name;
        this.fees = fees;
        this.strt_date = strt_date;
        this.end_date = end_date;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public LocalDate getStrt_date() {
        return strt_date;
    }

    public void setStrt_date(LocalDate strt_date) {
        this.strt_date = strt_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    @Override
    public String toString() {
        return "Course [course_id=" + course_id + ", end_date=" + end_date + ", fees=" + fees + ", name=" + name
                + ", strt_date=" + strt_date + "]";
    }

}