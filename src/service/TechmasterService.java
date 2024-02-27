package service;

import entities.Classroom;
import entities.Student;
import entities.TechMaster;

import java.util.ArrayList;
import java.util.Scanner;

public class TechmasterService {
    public void inputInfo(Scanner scanner){

        System.out.println("Moi ban nhap ten quan ly : ");
        String manager = scanner.nextLine();
        System.out.println("Moi ban nhap vao ten giao vien : ");
        String teacher = scanner.nextLine();
        ClassService classService = new ClassService();
        Classroom classroom = classService.printInfo(scanner);
        ArrayList<Classroom> classrooms = new ArrayList<>();
        classrooms.add(classroom);
        TechMaster techMaster = new TechMaster(manager,teacher,classrooms);
        System.out.println(techMaster);

    }
}
