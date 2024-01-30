//In this file we are going to work on switch statements.
//1.Traditional Switch statements.

import java.util.Scanner;

public class switch_statements{

    public static void main(String[] args)
    {
        //By using a scanner function we take the input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth number : ");
        int n = sc.nextInt();
        //In accordance with the input, user gets different output.
        //Don't forget to put break after every case. If you forget then inspite of input every case will be printed in the consol.
        switch (n)
        {
            case 1:
                System.out.println("You’re a natural at whatever you do!");
                break;
            case 2:
                System.out.println("Your creativity is on another level!");
                break;
            case 3:
                System.out.println("You’re the bravest person I know! I wish I was more like you.");
                break;
            case 4:
                System.out.println("You're better than a triple-scoop ice cream cone…with sprinkles.");
                break;
            case 5:
                System.out.println("You’re the sweetest—you don’t have a mean bone in your body, do you?");
                break;
            case 6:
                System.out.println("Talking to you is like a breath of fresh air.");
                break;
            case 7:
                System.out.println("Your energy is infectious!");
                break;
            case 8:
                System.out.println("You’re so kind that you make everyone around you a better person.");
                break;
            case 9:
                System.out.println("I love how you can turn even the simplest situation into something fun.");
                break;
            case 10:
                System.out.println("I wish I were half of the human you are.");
                break;
            case 11:
                System.out.println("I love how you decorated your house. It looks like it belongs on HGTV.");
                break;
            case 12:
                System.out.println("When you get famous, I want to be the president of your fan club.");
                break;
            case 13:
                System.out.println("You set such a good example for your kids.");
                break;
            case 14:
                System.out.println("You’re irreplaceable.");
                break;
            case 15:
                System.out.println("It’s too bad every boss can’t be like you.");
                break;
            case 16:
                System.out.println("I love your confidence. Can you send some of it my way?");
                break;
            case 17:
                System.out.println("You’re so kind everyone instantly feels like your friend.");
                break;
            case 18:
                System.out.println("I wish I could figure things out as quickly as you do.");
                break;
            case 19:
                System.out.println("You look flawless without makeup on.");
                break;
            case 20:
                System.out.println("Not everyone can pull off that look, but you sure can!");
                break;
            case 21:
                System.out.println("Your ideas will change the world one day.");
                break;
            case 22:
                System.out.println();
                break;
            case 23:
                System.out.println("You’re so inspiring. I look up to you.");
                break;
            case 24:
                System.out.println("Everyone should be able to come to you for advice.");
                break;
            case 25:
                System.out.println("Prince Charming has nothing on you!");
                break;
            case 26:
                System.out.println("You light up the room.");
                break;
            case 27:
                System.out.println("You have a great sense of humor.");
                break;
            case 28:
                System.out.println("You are strong.");
                break;
            case 29:
                System.out.println("You're even more beautiful on the inside.");
                break;
            case 30:
                System.out.println("You're like a ray of sunshine on a really dreary day.");
                break;
            case 31:
                System.out.println("Thank you for being there for me.");
                break;
            default:
                System.out.println("Invalid data!!!");
        }

    }
}