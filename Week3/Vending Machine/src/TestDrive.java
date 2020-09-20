import java.util.Scanner;

public class TestDrive {
    public static void userOptions() {
        System.out.println("Option available: ");
        System.out.println("Continue buying");
        System.out.println("Exit");
    }

    public static void main(String[] args) {
        VendingMachine vend_machine = new VendingMachine();
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        vend_machine.insert(coin);
        int user_input;
        System.out.println("Choose your item: ");
        do {
            String id = sc.nextLine();

            user_input = sc.nextInt();
            userOptions();
        } while (user_input == 1);

    }
}
