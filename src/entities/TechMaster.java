package entities;

import java.util.ArrayList;

public class TechMaster {
    private String manager;
    private String teacher;
    private ArrayList<Classroom> classrooms;


    public TechMaster(String manager, String teacher, ArrayList<Classroom> classrooms) {
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(ArrayList<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "manager='" + manager + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classrooms=" + classrooms +
                '}';
    }
}
