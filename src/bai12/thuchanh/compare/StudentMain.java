package bai12.thuchanh.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Tien", 29, "HN");
        Student student2 = new Student("Nam", 28, "HN");
        Student student3 = new Student("Trung", 27, "HN");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println("Before sort Name: ");
        for (Student st : studentList ) {
            System.out.println(st.toString());
        }
        System.out.println("After sort Name: ");
        Collections.sort(studentList);
        for (Student st : studentList ) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("After sort Age: ");
        for (Student st : studentList ) {
            System.out.println(st.toString());
        }
    }
}
