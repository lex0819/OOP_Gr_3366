import StudentDomen.StudentSteam;
import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
         User u1 = new User("Сергей","Иванов",25);
         Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
         Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
         Student s3 = new Student("Иван", "Петров", 22, (long)121);
         Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
         Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
         Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

         List<Student> listStud01 = new ArrayList<Student>();
         listStud01.add(s1);
         listStud01.add(s2);
         listStud01.add(s3);
         listStud01.add(s4);
         listStud01.add(s5);
         listStud01.add(s6);

         StudentGroup group01 = new StudentGroup(listStud01, "группа 01");

//         for(Student stud : group01)
//         {
//             System.out.println(stud);
//         }
//
//         System.out.println("============= после сортировки =============");
//         Collections.sort(group01.getStudents());
//
//
//         for(Student stud : group01)
//         {
//             System.out.println(stud);
//         }
        

//        Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
//        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
//
//        //EmploeeController contrEmp = new EmploeeController();
//        EmploeeController.paySalary(peron1);
//        //contrEmp.paySalary(s1);
//
//        Integer studHour[] = {124,234,231,1,45};
//        System.out.println(EmploeeController.mean(studHour));
//
//        Double emplSalary[] = {12555.23,34213.5,10000.0};
//        System.out.println(EmploeeController.mean(emplSalary));
//
        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);


         Student s07 = new Student("Сергей", "Иванов", 22, (long)101);
         Student s08 = new Student("Андрей", "Сидоров", 22, (long)111);
         Student s09 = new Student("Иван", "Петров", 22, (long)121);
         Student s10 = new Student("Игорь", "Иванов", 23, (long)301);

         List<Student> listStud02 = new ArrayList<Student>();
         listStud02.add(s07);
         listStud02.add(s08);
         listStud02.add(s09);
         listStud02.add(s10);

         StudentGroup group02 = new StudentGroup(listStud02, "группа 02");



         Student s11 = new Student("Даша", "Цветкова", 23, (long)171);
         Student s12 = new Student("Лена", "Незабудкина", 23, (long)104);

         List<Student> listStud03 = new ArrayList<Student>();
         listStud03.add(s11);
         listStud03.add(s12);

         StudentGroup group03 = new StudentGroup(listStud03, "группа 03");

         Student s13 = new Student("Mаша", "Цветкова", 23, (long)171);
         Student s14 = new Student("Леkа", "Незабудкина", 23, (long)104);

         List<Student> listStud04 = new ArrayList<Student>();
         listStud04.add(s13);
         listStud04.add(s14);

         StudentGroup group04 = new StudentGroup(listStud04, "группа 04");

         List<StudentGroup> listGroup01 = new ArrayList<StudentGroup>();
         listGroup01.add(group01);
         listGroup01.add(group02);
         listGroup01.add(group03);
         listGroup01.add(group04);

         StudentSteam course01 = new StudentSteam(listGroup01, "поток 01");

//         System.out.println(course01.getSteamName());
//
//         for ( StudentGroup group: course01){
//              System.out.println(group);
//         }
//
//         System.out.println("============= после сортировки =============");
//         Collections.sort(course01.getGroups());
//
//         for ( StudentGroup group: course01){
//              System.out.println(group);
//         }

         System.out.println(course01);
    }
}
