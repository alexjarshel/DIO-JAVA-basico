public class FirstClass {
    public static void main(String[] args) {

        String fistName = "Alex";
        String lastName = "Jarschel";

        String fullName = fullNmae(fistName, lastName);


        System.out.println(fullName);
    }    

    public static String fullNmae(String firstName, String lastName){
        return firstName.concat(" ").concat(lastName);
    }
}
