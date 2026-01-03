package OOPS;

import java.util.Scanner;

public class UserDefinedDatatype {
//    public static class Student{ // it's my own Crete data type
//        String name;
//        private int rno;
//        double cgpa;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(); // Creation of new Object // declaration
        System.out.println(s.percentage);
        System.out.println(s.getRno());
        s.setRno(75);
        System.out.println(s.getRno());
//        s.name = "Gyananjay";
//        s.rno = 117;
//        s.cgpa = 8.5;
//
//        Student s1 = new Student();
//        s1.name = "Pabitra";
//        s1.rno = 121;
//        s1.cgpa = 8.0;
//
//
//        Student s2 = new Student();
//        s2.name = sc.nextLine();
//        s2.rno = 210;
//        s2.cgpa = 8.4;
//        System.out.print(s2.name);
    }
}
