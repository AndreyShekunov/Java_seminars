package Homework6;

public class Person {

    String firstName;
    String lastName;
    Integer age;
    String sex;
    String speciality;
    String city;

    public Person(String LastName, String FirstName, Integer Age,
                  String Sex, String Speciality, String City) {

        this.lastName = LastName;
        this.firstName = FirstName;
        this.age = Age;
        this.sex = Sex;
        this.speciality = Speciality;
        this.city = City;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s %s; возраст: %s; пол: %s; специальность: %s; город: %s", lastName, firstName, age, sex, speciality, city);
    }

    @Override
    public boolean equals(Object arg) {
        if (arg == null)
            return false;
        if (!(arg instanceof Person))
            return false;
        Person anotherPerson = (Person) arg;
        return lastName.equals(anotherPerson.lastName) && firstName.equals(anotherPerson.firstName)
                && age.equals(anotherPerson.age) && sex.equals(anotherPerson.sex)
                && speciality.equals(anotherPerson.speciality)
                && city.equals(anotherPerson.city);
    }

    @Override
    public int hashCode() {
        Object[] m = {firstName, lastName, age, sex, speciality, city };
        int res = 1;
        for (Object x : m) {
            res = 31 * res + x.hashCode();
        }
        return res;
    }
}
