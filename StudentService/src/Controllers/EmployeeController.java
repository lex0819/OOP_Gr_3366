package Controllers;

import StudentDomen.Employee;
import StudentDomen.User;
import StudentService.EmployeeService;

/**
 * класс-контроллер с методами для сотрудников
 */
public class EmployeeController implements iUserController<Employee> {
    private final EmployeeService empService = new EmployeeService();

    /**
     * Создание нового работника
     * @param firstName Фамилия
     * @param secondName Имя
     * @param age Возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    /**
     * статический метод выплаты зарплаты сотрудникам
     * все типы сотрудников - наследники Employee
     * @param person сотрудник
     * @param <T> объект-наследник от Employee
     */
    static public <T extends Employee> void paySalary(T person)
    {
        System.out.println(((User) person).getFirstName()+" зп 10000р ");
    }

    /**
     * статический метод расчета среднего арифметического в массиве
     * массив чисел-наследников Number
     * @param num массив чисел
     * @param <T> тип чисел-наследников Number
     * @return среднее арифметической
     */
    static public <T extends Number> Double average(T[] num)
    {
        double sum = 0.0;
        for (T t : num) {
            sum = sum + t.doubleValue();
        }
        return sum/num.length;
    }
}
