package Person;

public class Main {
    public static void main(String[] args) {
        Person man = new Person();
        man.id = 123;
        man.name = "John";
        man.age = 20;
        man.gender = true;
        man.address = "HN";
        System.out.println(man.id + " " + man.name + " " + man.age);
        man.sleep();
        man.job();

        Person woman = new Person();
        woman.id = 123;
        woman.name = "John";
        woman.age = 20;
        woman.gender = true;
        woman.address = "HN";
        woman.hobbit();
    }

}
