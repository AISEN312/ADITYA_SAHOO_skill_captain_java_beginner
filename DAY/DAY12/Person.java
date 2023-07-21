public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public static void main(String[] args){
    Person alice = new Person("Alice",23);
    Person ram = new Person("Ram",22);
        System.out.println("Person1: ");
    System.out.println("Name:"+ alice.getName()+",Age:" + alice.getAge());
        System.out.println("\nPerson2: ");
    System.out.println("Name:"+ ram.getName()+",Age:" + ram.getAge());}

}
