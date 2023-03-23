import java.util.Scanner;

public class MethodPractice {

    public static void main (String[] args){ // Метод точки входа
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = cale (num1, num2, operation);
        System.out.println("Result: " + result);
    }
    private static double cale(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default: return 0;
        }
    }
    private static char getOperation() {
        Scanner in = new Scanner(System.in); // 1 + ; 2 -
        switch (in.nextInt()){
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            default: return '+';
        }
    }
    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
