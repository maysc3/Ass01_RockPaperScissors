import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String play1 = "";
        String play2 = "";
        String continueYN = "";
        boolean done = false; // game state loop
        do
        {
            boolean play1Move = false; // gets P1 move
            do
            {
                System.out.print("Enter move player1 [R,P,S]: ");
                play1 = in.next();
                if      (play1.equalsIgnoreCase("R") ||
                        play1.equalsIgnoreCase("P") ||
                        play1.equalsIgnoreCase("S"))
                {
                    play1Move = true;
                }
            }
            while(!play1Move);

            boolean play2Move = false; // gets P2 move
            do
            {
                System.out.print("Enter move player2 [R,P,S]: ");
                play2 = in.next();
                if      (play2.equalsIgnoreCase("R") ||
                        play2.equalsIgnoreCase("P") ||
                        play2.equalsIgnoreCase("S"))
                {
                    play2Move = true;
                }
            }
            while(!play2Move);
            if (play1.equalsIgnoreCase("R")) // game logic
            {
                if (play2.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie. ");
                }
                else if (play2.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers rock Player2 wins. ");
                }
                else
                {
                    System.out.println("Rock breaks scissors Player1 wins. ");
                }
            }
            else if (play1.equalsIgnoreCase("P"))
            {
                if (play2.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers rock Player1 wins. ");
                }
                else if (play2.equalsIgnoreCase("P"))
                {
                    System.out.println("It's a tie.");
                }
                else
                {
                    System.out.println("Scissors cuts paper Player2 wins. ");
                }
            }
            else
            {
               if (play2.equalsIgnoreCase("R"))
               {
                   System.out.println("Rock breaks scissors Player2 wins. ");
               }
               else if (play2.equalsIgnoreCase("P"))
               {
                   System.out.println("Scissors cuts paper Player1 wins. ");
               }
               else
               {
                   System.out.println("It's a tie. ");
               }
            }

            System.out.println("Do you want to play again [Y/N]? ");
            continueYN = in.next();
            if (continueYN.equalsIgnoreCase("N")) // replay if
            {
                done = true;
            }
        }
        while(!done);
    }
}