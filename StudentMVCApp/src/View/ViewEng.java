package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

/**
 * класс вывода данных пользователю в консоль на английском языке
 */
public class ViewEng implements iGetView {
    /**
     * метод красиво выводит список студентов в консоль на экран
     * @param students список студентов
     */
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----List of the students-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----End of the list-----");
    }

    /**
     * метод предоставляет возможность взаимодействия пользователя с приложением в консоли
     * @param message содержит вопрос к пользователю, на который ожидает ответа
     * @return возвращает ответ пользователя
     */
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * @return prompt на английском языке
     */
    public String getPrompt(){
        return "Please enter the command:  ";
    }

    /**
     * @return exit на английском языке
     */
    public String getExit(){
        return "Program was ended!";
    }
}