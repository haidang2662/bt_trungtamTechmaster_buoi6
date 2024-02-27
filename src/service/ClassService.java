package service;

import entities.Classroom;
import entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassService {
    public Classroom printInfo(Scanner scanner){
        System.out.println("Moi ban nhap mon hoc : ");
        String subject = scanner.nextLine();
        System.out.println("Moi ban nhap so hoc vien ban muon nhap");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap thong tin cho sinh vien thu "+(i+1));
            StudentService studentService = new StudentService();
            Student student = studentService.printInfo(scanner);
            students.add(student);
        }
         Classroom classroom = new Classroom(subject,students);
        System.out.println(classroom);
        return classroom;
    }
}
