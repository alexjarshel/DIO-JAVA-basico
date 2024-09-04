package school;

public class School {

    public static void main(String[] args) {
        Student alex = new Student();
        alex.setName("Alex"); 
        alex.setAge(22);

        System.out.println("Student " + alex.getName() + " has " + alex.getAge() + " Years old");
    }
    
}
 