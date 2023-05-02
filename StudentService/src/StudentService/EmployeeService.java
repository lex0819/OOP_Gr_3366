package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.UserComparator;

/**
 * класс пораждает список сотрудников
 */
public class EmployeeService implements iUserService<Employee> {
    private int count;///< count of Employees
    private List<Employee> employees;///< list of Employees

    /**
     * constructor
     */
    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }

    /**
     * метод создает нового сотрудника и добавляет его в список
     *
     * @param firstName  Фамилия
     * @param secondName Имя
     * @param age        возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Employee per = new Employee(firstName, secondName, age, count);
        count++;
        employees.add(per);
    }

    /**
     * @return возвращает список сотрудников
     */
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    /**
     * @return отсортированный список сотрудников по ФИО
     */
    public List<Employee> getSortedByFIOEmployees() {
        List<Employee> employees = new ArrayList<>(this.employees);
        employees.sort(new UserComparator<Employee>());
        return employees;
    }
}
