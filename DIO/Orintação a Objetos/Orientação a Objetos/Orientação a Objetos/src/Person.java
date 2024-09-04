public class Person {
    
    private String name;
    private String documentNumber;
    private String address;

    public Person(String name, String documentNumber){
        this.name = name;
        this.documentNumber = documentNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

}
