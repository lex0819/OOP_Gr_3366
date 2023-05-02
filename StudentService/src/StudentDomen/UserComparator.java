package StudentDomen;

import java.util.Comparator;

/**
 * обобщенный класс предоставляет метод сравнения двух объектов
 * класса User и его потомков
 * @param <T> объекты класса User и его потомков
 */
public class UserComparator<T extends User> implements Comparator<T> {

    /**
     * метод сравнивает два объекта User, а также его потомков
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return compare of JAVA
     */
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }

}
