public class RegistrationSystem {
    public static void main(String[] args) {
        
        Person alex = new Person("Alex","121324542366");

        alex.setAddress("Bernardo Olsen 1397");
        System.out.println(alex.getName());
        System.out.println(alex.getAddress());
        System.out.println(alex.getDocumentNumber());

    }
}
