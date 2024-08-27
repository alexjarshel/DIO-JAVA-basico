public class TypesOfVariables {

    // Primitive Types non Objetcs

    // - BYTE 1 Byte -128 - 127
    // - SHORT 2 Bytes -32.768 - 32767
    // - INT 4 Bytes +- -2B - +- 2B
    // - LONG 8 Bytes a lot
    // - FLOAT 4 Bytes
    // - DOUBLE 8 Bytes
    // - BOOLEAN
    // - CHAR

    public static void main(String[] args) {
        double minimumSalary = 2500.33;
        int age = 23;
        boolean isActive = true;

        short shortNumber = 1;
        int normalNumber = shortNumber;
        short otherShortNumber = (short) normalNumber;

        int number = 7;

        number = 12;

        final double PI_VALUE = 3.1416;

        System.out.println(number);
    }
}