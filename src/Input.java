import java.util.Scanner;
public class Input{
    public static void main(String[] ags){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double weight;
        boolean smoker;
        System.out.println("Enter your name: ");
        name = scanner.next();
        System.out.println("What is your age: ");
        age = scanner.nextInt();
        System.out.println("What is your weight: ");
        weight = scanner.nextDouble();
        System.out.println("Are you a smoker? Enter True/False: ");
        smoker = scanner.nextBoolean();

        System.out.println("You entered: " + name + " " + age + " " + weight + " " + smoker);

    }
}
