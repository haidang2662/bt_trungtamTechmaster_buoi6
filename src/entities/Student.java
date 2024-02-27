package entities;

public class Student {
    private int id;
    private String name;
    private int age;
    private String classify;

    public Student(int id, String name, int age, String classify) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classify = classify;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Override
    public String toString() {
        return "entities.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classify='" + classify + '\'' +
                '}';
    }
}
