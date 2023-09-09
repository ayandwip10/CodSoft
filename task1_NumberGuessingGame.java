import java.util.Scanner;

class task1_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!!!");
        System.out.println("You will be given 10 attempts to guess the number.");
        System.out.println("The given number is between 1 & 100.");

        while (true) {
            System.out.print("Enter 1 to play and any other number to exit: ");
            int n = sc.nextInt();
            if (n == 1)
                play();
            else {
                System.out.println("THANK YOU FOR VISITING");
                break;
            }
        }
    }

    public static void play() {
        Scanner sc = new Scanner(System.in);
        int i = 10;
        double r = Math.random() * 100;
        int randomNumber = (int)r;

        while (i > 0) {
            System.out.println("Enter your number : ");
            int userNumber = sc.nextInt();
            if (randomNumber == userNumber) {
                System.out.println("\nCONGRATULATIONS !!! YOU HAVE GUESSED THE CORRECT NUMBER...");
                System.out.println("Based on the number of your attempts.........");
                System.out.println("You have scored " +(10*i)+ " points");
                System.out.println("\nAre you willing to play another round ???");
                return;
            }
            else if (userNumber>100 || userNumber<1) {
                System.out.println("The number you guessed is out of range");
            }
            else if (randomNumber > (2*userNumber)) {
                System.out.println("The number you guessed is too low");
            }
            else if (randomNumber > userNumber) {
                System.out.println("The number you guessed is lower compared to my number");
            }
            else if (randomNumber < userNumber) {
                System.out.println("The number you guessed is higher compared to my number");
            }
            i--;
        }

        System.out.println("\nYOU LOST");
        System.out.println("The correct number was: " + randomNumber);
        System.out.println("You can try again.");
    }
}