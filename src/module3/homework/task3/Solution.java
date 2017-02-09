package module3.homework.task3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {

        GregorianCalendar startDate = new GregorianCalendar(2016, Calendar.SEPTEMBER, 20);

        Course course1 = new Course(startDate, "Harrison");
        Course course2 = new Course(240, "JavaSript", "Morgan");
        Course course3 = new Course(200, "Css", "Reachman");
        Course course4 = new Course(360, "Java", "Noell");
        Course course5 = new Course(startDate, "Freeman");
        System.out.println(course2.getHoursDuration() + " "
                + course2.getName() + " "
                + course2.getTeacherName());
        System.out.println(course5.getStartDate().getTime() + " " + course5.getTeacherName());
        System.out.println("\n=============================\n");

        Course[] coursesTaken = {course1, course2, course3, course4, course5};

        Student student1 = new Student("Alex", "Rude", 5);
        Student student2 = new Student("Maluj", coursesTaken);
        student1.setAge(29);
        System.out.println(student1.getFirstName() + " "
                + student1.getLastName() + " "
                + student1.getGroup());
        System.out.println("Age of student1 is: " + student1.getAge());
        System.out.println(student2.getLastName() + " "
                + student2.getCoursesTaken()); //how to input of array?

        System.out.println("\n=============================\n");

        CollegeStudent student3 = new CollegeStudent("Egor", "Linnik", 5);
        CollegeStudent student4 = new CollegeStudent("Hrebeniuk", coursesTaken);
        CollegeStudent student5 = new CollegeStudent("Alexsandr", "Mazur", 5, "KNU", 98, 10000005147L);
        System.out.println(student3.getFirstName() + " "
                + student3.getLastName() + " "
                + student3.getGroup());
        System.out.println(student4.getLastName() + " "
                + student4.getCoursesTaken()); //how to input of array?
        System.out.println(student5.getLastName() + " "
                + student5.getCollegeName() + " "
                + student5.getId());
        System.out.println("\n=============================\n");

        SpecialStudent student6 = new SpecialStudent("Ohanov", coursesTaken);
        SpecialStudent student7 = new SpecialStudent("Katie", "Sova", 5, "KDPNU", 78, 10000008514L);
        SpecialStudent student8 = new SpecialStudent("Olena", "Marchenro", 5, 95124);
        System.out.println(student7.getLastName() + " "
                + student7.getCollegeName() + " "
                + student7.getId());
        System.out.println(student8.getLastName() + " "
                + student8.getGroup());
        System.out.println("\n=============================\n");

        student6.setEmail("oganov88@mail.com");
        System.out.println("Email of student6 is: " + student6.getEmail());

    }
}
