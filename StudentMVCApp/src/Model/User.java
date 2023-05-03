package Model;

/**
 * базовый класс-предок User для создания пользователей
 */
public class User {

    private String firstName;///< Фамилия
    private String secondName;///< Имя
    private int age;///< возраст

    /**
     * конструктор, создает нового пользователя
     * @param firstName Фамилия
     * @param secondName Имя
     * @param age Возраст
     */
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    /**
     * @return Фамилию
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName присваивает фамилию
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return Имя
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName присваивает Имя
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age присваивает возраст
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return красивый вывод объекта User на экран
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
