package model;

import java.util.ArrayList;

public class Classroom {

    private final ArrayList<Student> students;


    public Classroom() {
        this.students = new ArrayList<>();
    }


    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public int getSize() {
        return this.students.size();
    }

    public void create(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> search(String term) {
        ArrayList<Student> students = new ArrayList<>();

        for (Student student: this.students) {
            if (student.getName().toLowerCase().contains(term) || student.getNim().contains(term) || student.getEmail().toLowerCase().contains(term) || student.getPhone().contains(term)) {
                students.add(student);
            }
        }

        return students;
    }
}
