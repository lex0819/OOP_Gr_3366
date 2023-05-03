package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * класс вывода данных пользователю в консоль
 */
public class View implements iGetView {
    /**
     * метод красиво выводит список студентов в консоль на экран
     * @param students список студентов
     */
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Вывод списка студентов-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----Конец списка-----");
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
     * @return prompt на русском языке
     */
    public String getPrompt(){
        return "Введите команду:  ";
    }

    /**
     * @return exit на руском языке
     */
    public String getExit(){
        return "Выход из программы!";
    }
}