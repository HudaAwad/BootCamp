package module1.homework;

public class BadCodeExample {
    int number1 = 13;
    int number2 = 16;

    void operationsWithNumbers() {
        //lets try to multiply the above numbers
        int result = number1 * number2;

        //and divide by 3 to get a fraction
        double fraction = result / 3;
        System.out.println("this is the resulting number");
        System.out.println(fraction);
    }

    void operationsWithText() {
        String str = "This is a text";
        char charcter = 'A';
        String combinedText = "text " + "can be combined";
        System.out.println(combinedText);
    }
}
