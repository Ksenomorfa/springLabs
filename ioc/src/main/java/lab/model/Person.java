package lab.model;

import java.util.List;

public interface Person {
    String getName ();
    int getAge();
    Country getCountry();
    float getHeight();
    boolean isProgrammer();
    List<String> getContacts();

    public void setName(String name);
    default void sayHello(Person person) {
        System.out.printf("Hello, %s, I`m %s!", person.getName(), getName());
    }
}