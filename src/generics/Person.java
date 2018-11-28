package generics;

import java.util.Objects;

public class Person implements Comparable {

    String cnp;
    String name;
    int age;
    String jobStatus;

    public Person(String name, int age, String cnp) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;

    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobStatus='" + getClass() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(cnp, person.cnp);
    }


    @Override
    public int compareTo(Object o) {

        Person temp = (Person) o;

        return this.name.compareTo(temp.name);


    }
}
