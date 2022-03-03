package HomeWork.five;

public class worker {

    String name;
    String position;
    String email;
    String telephone;
    int salary;
    int age;

    public worker(String name, String position, String email, String telephone, int salary, int age) {
        this.name = name;
        System.out.println("Имя сотрудника: " + name);
        this.position = position;
        System.out.println("Занимаемая должность: " + position);
        this.email = email;
        System.out.println("Почтовый адрес: " + email);
        this.telephone = telephone;
        System.out.println("Номер телефона: " + telephone);
        this.salary = salary;
        System.out.println("Заработная плата: " + salary);
        this.age = age;
        System.out.println("Возраст сотрудника: " + age);
        System.out.println("");
    }
}
