package module3.homework.task3;

import java.util.*;

public class Course {
    private GregorianCalendar startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(GregorianCalendar startDate, String teacherName) {
        this.startDate = startDate;
        this.teacherName = teacherName;
    }

    public Course(int hoursDuration, String name, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return  "\n" + "Course: " +
                " name= " + name +
                ", hoursDuration= " + hoursDuration +
                ", teacherName= " + teacherName;
    }
}
