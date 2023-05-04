import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
//import Model.Model;

import Model.Student;
import View.View;
import View.ViewEng;

public class App {

    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", "Иванов", 21, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 25, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);


        FileRepo fileRepo = new FileRepo("StudentDb.txt");
        //    for(Student pers :students)
        //    {
        //     fileRepo.addStudent(pers);
        //    }
        //    fileRepo.saveAllStudentToFile();


//        iGetModel model = new Model(students);
        iGetModel modelFileRepo = fileRepo;

        System.out.println("Выберите язык интерфейса\n1 - english\n2 - русский");
        Scanner in = new Scanner(System.in);
        var answer = in.nextLine();

        if( answer.equals("1") ){
            iGetView view = new ViewEng();
            Controller control = new Controller(view, modelFileRepo);
            //control.updateView();
            control.run();
        }else if(answer.equals("2")){
            iGetView view = new View();
            Controller control = new Controller(view, modelFileRepo);
            control.run();
        }else{
            iGetView view = new ViewEng();
            Controller control = new Controller(view, modelFileRepo);
            control.run();
        }


//        Controller control = new Controller(view, modelFileRepo);
//        control.run();
        // control.updateView();
    }
}