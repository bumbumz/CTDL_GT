public class Person {
    private String name;
    private String age;
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    private Person next;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public Person getNext() {
        return next;
    }
    public void setNext(Person next) {
        this.next = next;
    }

    

}
