package Homework6;

import java.util.ArrayList;

public class main {
    /*
     * Создать класс Person.
     * У класса должны быть поля:
     * 1. Имя (String)
     * 2. Фамилия (String)
     * 3. Возраст (продумать тип)
     * 4. Пол
     * 5*. Придумать свои собственные поля
     *
     * Для этого класса
     * 1. Реализовать методы toString, equals и hashCode.
     * 2*. Придумать собственные методы и реализовать их
     *
     * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и
     * вывести их на экран.
     */
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person personOne = new Person("Сергеев", "Пётр", 20, "муж", "рабочий", "Екатеринбург");
        Person personTwo = new Person("Иванов", "Сергей", 25, "муж", "рабочий", "Екатеринбург");
        Person personThird = new Person("Смирнов", "Павел", 18, "муж", "рабочий", "Екатеринбург");
        Person personFourth = new Person("Сидоров", "Антон", 35, "муж", "мастер", "Екатеринбург");

        persons.add(personOne);
        persons.add(personTwo);
        persons.add(personThird);
        persons.add(personFourth);

        for (Person work : persons) {
            if (Integer.parseInt(String.valueOf(work.age)) > 20) {
                System.out.println(work);
            }

        }

        System.out.println(personOne.firstName.equals(personThird.firstName));
        System.out.println(personOne.lastName.hashCode());
        System.out.println(personFourth.lastName.hashCode());

    }
}
