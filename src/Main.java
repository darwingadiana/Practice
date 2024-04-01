import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ernter a numebr: ");
        int number = scanner.nextInt();

        System.out.println("The droot of "+number+" is "+droot(number));

    }

}
