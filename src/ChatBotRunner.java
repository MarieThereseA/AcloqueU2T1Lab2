import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args){

        ChatBot debbie = new ChatBot("Debbie", 13);
        Scanner scan = new Scanner(System.in);

        //greeting method
        System.out.print("What's your name? ");
        String yourName = scan.nextLine();
        debbie.greeting(yourName);
        System.out.println();

        //favoriteNumber method
        System.out.print("What's your favorite number? ");
        int favNum = scan.nextInt();
        scan.nextLine();
        debbie.favoriteNumber(favNum);
        System.out.println();

        // convertfeetToMeters method
        System.out.print("How tall are you? (Round ur height to the nearest foot) ");
        int height = scan.nextInt();
        System.out.println("You're " + debbie.convertFeetToMeters(height) + " meters tall!");
        System.out.println();

        // add.Numbers method
        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter another number: ");
        int num2 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter another number: ");
        int num3 = scan.nextInt();
        scan.nextLine();
        System.out.println("The sum of your numbers is " + debbie.addNumbers(num1,num2,num3) + "!");
        System.out.println();


        //weather method
        System.out.print("In one word, how do you feel about the weather right now? ");
        scan.nextLine();
        debbie.weather();
        System.out.println();

        //goodbye method
        System.out.print(debbie.goodbye());

        scan.close();

        debbie.age(21);
        System.out.println(debbie.old(16,21));
    }
}
