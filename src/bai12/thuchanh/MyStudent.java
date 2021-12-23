package bai12.thuchanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyStudent {
    private String name;
    private int age;
    private String address;

    public MyStudent(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public MyStudent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%10S%10s%10d%10s","MyStudent",name,age,address);
    }

    public static void main(String[] args) {
        MyStudent student1 = new MyStudent("Nam",20, "HN");
        MyStudent student2 = new MyStudent("Hung",21, "HN");
        MyStudent student3 = new MyStudent("Ha",22, "HN");
        // write your code here
        Map<Integer, MyStudent> studentMap = new HashMap<Integer, MyStudent>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, MyStudent> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<MyStudent> students = new HashSet<MyStudent>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(MyStudent student : students){
            System.out.println(student.toString());
        }
    }
}