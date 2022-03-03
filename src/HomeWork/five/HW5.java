package HomeWork.five;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.concurrent.Worker;

public class HW5 {

    public static void main(String[] args) {

        worker Worker1 = new worker("alex", "IT", "alex@mail.ru", "84955648795", 60000, 32);
        worker Worker2 = new worker("mike", "manager", "mike@ya.ru", "84955648743", 70000, 41);
        worker Worker3 = new worker("ruby", "HR", "ruby@gmail.com", "84955648728", 55000, 35);
        worker Worker4 = new worker("oleg", "lawyer", "oleg@rambler.ru", "84955648716", 63000, 28);
        worker Worker5 = new worker("sany", "Boss", "sany@boss.ru", "84955648700", 80000, 44);

        worker[] workers = new worker[5];
        workers[0] = Worker1;
        workers[1] = Worker2;
        workers[2] = Worker3;
        workers[3] = Worker4;
        workers[4] = Worker5;

        System.out.println("Задание 5 вывести сотрудников чей возраст страше 40 лет");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                System.out.println("Имя сотрудника: " + workers[i].name);
                System.out.println("Занимаемая должность: " + workers[i].position);
                System.out.println("Почтовый адрес: " + workers[i].email);
                System.out.println("Номер телефона: " + workers[i].telephone);
                System.out.println("Заработная плата: " + workers[i].salary);
                System.out.println("Возраст сотрудника: " + workers[i].age);
                System.out.println("");
            }
        }
    }
}
