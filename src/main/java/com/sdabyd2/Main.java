package com.sdabyd2;

import com.sdabyd2.controller.StudentController;
import com.sdabyd2.model.Student;
import com.sdabyd2.view.StudentView;

public class Main {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Adrian");
        student.setRollNo("5");
        return student;
    }
}