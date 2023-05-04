package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import javax.jws.WebParam.Mode;

import Model.Student;
import Model.Model;
import View.View;

/**
 * класс Контроллер предоставляет функционал для взаимодействия
 * всех частей приложения между собой
 */
public class Controller {

    private List<Student> students;///< список студентов
    private iGetView view;///< View визуальный интерфейс в консоли
    private iGetModel model;///< Model функционал для работы с данными
    Scanner in = new Scanner(System.in);

    /**
     * конструктор
     * @param view визуальный интерфейс в консоли
     * @param model функционал для работы с данными
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    /**
     * метод обращается к модели и возвращает список студентов
     */
    public void getAllStudent()
    {
        students = model.getAllStudent();
    }

    /**
     * метод удаления студента по его номеру
     * запрашивает номер с консоли
     */
    public void deleteStudentID()
    {
        System.out.println("Введите номер студента:  ");
        long id = Long.parseLong(in.nextLine());
        long res = model.deleteStudent(id);

        if(res == -1){
            System.out.printf("Студент с номером %d не найден в списке\n", id);
        }else {
            System.out.printf("Студент с номером %d успешно удален\n", id);
        }
    }

    /**
     * метод проверяет список студентов на валидность
     * @return истину если модель прислала валидные данные
     */
    public boolean testData()
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * метод обращается ко View и предоставляет валидные данные для отображения пользователю
     */
    public void updateView()
    {
        //MVP
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudent(model.getAllStudent());
    }

    /**
     * метод запускает в консоли визуальный интерфейс для взаимодействия с пользователем
     * метод стартует прогамму для выполнения команд пользователя
     */
    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt(view.getPrompt());
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println(view.getExit());
                    break;
                case LIST:
//                    getAllStudent(); двойной вызов, двойной список
                    updateView();
                    break;
                case DELETE:
                    deleteStudentID();
                    updateView();
                    break;
            }
        }
    }
}