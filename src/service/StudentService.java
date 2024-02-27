package service;

import entities.Student;

import java.util.Scanner;

public class StudentService {
    public Student printInfo(Scanner scanner){
        System.out.println("Moi ban nhap vao id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap vao ten : ");
        String name = scanner.nextLine();
        System.out.println("Moi ban nhap vao tuoi : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap vao hoc luc : ");
        String classify = scanner.nextLine();
        Student student = new Student(id,name,age,classify);
        System.out.println(student);
        return student;
    }
}
