import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ernter a numebr: ");
        int number = scanner.nextInt();

        System.out.println("The droot of "+number+" is "+droot(droot(number)));

    }

    public static int droot(int number) {
        int sum = 0;
        int digit = 0;
        while(number > 0) {
            digit = number % 10;
            number = number / 10;
            sum = sum + digit;
        }

        return sum;
    }

}
