package StudentDomen;

/**
 * класс содержит описание Сотрудника
 */
public class Employee extends User {

    private int empId;///< ID сотрудника

    /**
     * конструктор
     * @param firstName Фамилия
     * @param secondName Имя
     * @param age возраст
     * @param empId ID сотрудника
     */
    public Employee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }

    /**
     * @return ID сотрудника
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId ID сотрудника
     * присваевает сотруднику ID
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

}
