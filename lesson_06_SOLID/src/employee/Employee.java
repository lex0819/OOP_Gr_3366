/*
 * Базовое задние:
 * 1) Переписать код в соответствии с Single Responsibility Principle:
 * Подсказка: вынесите метод calculateNetSalary() в отдельный класс
 * Допущение - кадровик заводит сотрудника и назначает ему базовый оклад,
 * а бухгалтер назначает процент налогов
 * */

package employee;

import java.util.Date;

/**
 * класс содержит описание сотрудника, доступное для кадровика
 */
public class Employee {
    private String name;///< имя
    private Date dob;///< дата рождения
    private int baseSalary;///< базовый оклад

    /**
     * конструктор
     * @param name имя
     * @param dob дата рождения
     * @param baseSalary базовый оклад
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * @return на печать информацию о сотруднике
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}