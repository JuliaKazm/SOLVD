package People;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) throws InvalidAgeException {
        if (age < 18 || age > 80) {
            throw new InvalidAgeException();
        }
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age +"";
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 3 * result + name.hashCode();
        result = 3 * result + age;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }
}