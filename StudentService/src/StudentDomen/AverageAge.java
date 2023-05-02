package StudentDomen;

import java.util.ArrayList;
import java.util.List;

/**
 * класс предоставляет метод подсчета среднего возраста
 * студентов, учителей и работников
 */
public class AverageAge<T extends User> {
    /**
     * метод расчитывает средний возраст пользователей из списка
     * @param users список объектов-наследников класса User
     * @return средний возраст людей из списка
     */
    public Double averageAge(ArrayList<T> users){
        double sum = 0.0;

        for (T user : users) {
            sum = sum + user.getAge();
        }
        return sum/users.size();
    }
}
