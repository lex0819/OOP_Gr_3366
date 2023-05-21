package employee;

/**
 * класс содержит функцию вычисления зарплаты после вычета налогов
 */
public class Calculate{
    private int baseSalary;
    private int taxPercent;

    /**
     * конструктор
     * @param baseSalary базовый оклад
     * @param taxPercent процент налога
     */
    public Calculate(int baseSalary, int taxPercent){
        this.baseSalary = baseSalary;
        this.taxPercent = taxPercent;
    }

    /**
     * @return сумму зарплаты после вычета налогов
     */
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * taxPercent / 100);//calculate in other way
        return baseSalary - tax;
    }
}