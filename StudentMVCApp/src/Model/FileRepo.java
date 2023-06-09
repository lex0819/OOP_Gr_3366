package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

/**
 * класс предоставляет методы для работы с текстовым файлом
 * в котором содержится список студентов
 * можно читать из файла
 * можно записывать в файл
 */
public class FileRepo implements iGetModel {
    private String fileName;///< путь к файлу/имя файла
    private List<Student> students;///< список студентов

    /**
     * конструктор класса
     * инициирует файл и список студентов в памяти
     * @param fileName путь к файлу с данными, со списком студентов
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * метод добавляет Студента в Список в памяти
     * @param student объект класса Студент
     */
    public void addStudent(Student student)
    {
        this.students.add(student);
    }

    /**
     * метод открывает файл fileName и читает из него список студентов
     * заполняет этими данными students - список студентов в памяти
     * при каждом новом чтении файла список перезатирается
     * новыми данными из файла
     */
    public void readAllStudentsFromFile()
    {
        students.clear();// добавила обнуление списка, иначе было задвоение, затроение и тд
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * метод открывает файл fileName и записывает в него список студентов
     * из списка в памяти students
     * запись в конец файла заменена на перезапись всего содержимого файла
     * списком объктов Студент из памяти
     * потому, что было задвоение, затроение и т.д.
     */
    public void saveAllStudentToFile()
    {
        try(FileWriter fw = new FileWriter(fileName, false))
        {
            for(Student pers : students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getStudentID());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * метод получает список студентов
     * @return возвращает список студентов
     */
    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }

    /**
     * метод удаляет студента по его номеру из списка в памяти
     * и сохраняет актуальный список студентов в файл
     * удаление стандартной функцией remove()
     * список мутирует!!! Иммутабельности нет!
     * @return id студента в случае успешного удаления,
     * либо -1, если нет студента с таким номером
     */
    @Override
    public long deleteStudent(long id) {
        int index = -1;
        for(Student student: students){

            if(student.getStudentID() == id){
                index = students.indexOf(student);
            }
        }
        if(index == -1){
            return -1;
        }else {
            students.remove(index);
            saveAllStudentToFile();
            return id;
        }
    }

}