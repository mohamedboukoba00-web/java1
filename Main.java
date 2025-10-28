import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" What is your name :");
        String name = scanner.nextLine();

        System.out.println(" what is you age ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" What is your favorite food ");
        String food = scanner.nextLine();
        System.out.println("-------------");
        System.out.println(" Hello " + name + " You are " + age + " years old and you favorite food is " + food);

    }

}