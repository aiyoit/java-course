package oops.klass;

public class Human {

    // name, age, address
    String name;
    int age;
    String address;

    Human(String pName, int pAge, String pAddress) {
        System.out.println("P - " + pName);
        System.out.println("P - " + pAge);
        System.out.println("P - " + pAddress);

        name = pName;
        age = pAge;
        address = pAddress;

    }


    // detail
    void printDetail() {
        System.out.println(name + " is " + age + " years old, he/she is from " + address);
    }

}
