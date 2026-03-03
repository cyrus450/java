package generics;

public class GenericDemo {

    /* Step 2: Generic Method */
    static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    /* Step 3: Main Method */
    public static void main(String[] args) {

        // Using Storage class with Integer
        Storage<Integer> intStorage = new Storage<>();
        intStorage.setItem(100);
        System.out.println("Stored Integer: " + intStorage.getItem());

        // Using Storage class with String
        Storage<String> stringStorage = new Storage<>();
        stringStorage.setItem("Hello Generics");
        System.out.println("Stored String: " + stringStorage.getItem());

        // Arrays of different data types
        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Java", "Generics", "MCA"};
        Double[] dblArray = {2.5, 4.5, 6.5};
        Character[] charArray = {'A', 'B', 'C'};

        // Printing arrays using generic method
        System.out.println("\nInteger Array:");
        printArray(intArray);

        System.out.println("\nString Array:");
        printArray(strArray);

        System.out.println("\nDouble Array:");
        printArray(dblArray);

        System.out.println("\nCharacter Array:");
        printArray(charArray);
    }
}