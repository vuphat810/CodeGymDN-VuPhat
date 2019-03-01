public class Person {

    String name;
    int age;
    Person() {
        this.name = "William";
        this.age = 20;
    }

    Person(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }
    String getName() {
       return this.name;
    }
    int getAge() {
       return this.age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Phát", 22);
        System.out.println("My name is " + person1.getName() + " and I'm " + person1.getAge() + " years old.");
        Person person2 = new Person();
        System.out.println("My name is " + person2.getName() + " and I'm " + person2.getAge() + " years old.");
    }

}
