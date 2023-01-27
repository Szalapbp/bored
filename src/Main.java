
import java.util.Random;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {

        String PlayAgain;
        int Die1;
        int Die2;
        int Player1Sum=0;
        int Player2Sum=0;
        int Round = 0;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean winner;
        boolean yesno;

        do
        {
            System.out.println("Whoever rolls the higher number wins. Best of 3.");
            System.out.println("  ");
            System.out.println("In the case of a draw round, the player at the end of the game with the most points wins the game.");
            System.out.println("  ");
            System.out.println("In the case of 3 draw rounds, the game will start over.");
            System.out.println("  ");
            do
            {

            System.out.println("Player1 is up... Enter any Key to roll the die.");
                System.out.println("  ");
                Die1 = rnd.nextInt(6) + 1;
                System.out.println("Player1 Rolled a " + Die1 + ".");
                System.out.println("  ");
                System.out.println("Player2 is up... Enter any Key to roll the die.");
                System.out.println("  ");
                Die2 = rnd.nextInt(6) + 1;
                System.out.println("Player2 Rolled a " + Die2 + ".");
                System.out.println("  ");
                Player1Sum = Player1Sum + Die1;
                Player2Sum = Player2Sum + Die2;
                Round = Round + 1;
                if (Player1Sum > Player2Sum)
                {
                    System.out.println("Player1 Wins That Round!");
                    System.out.println( "  "  );
                }
                else if(Player2Sum > Player1Sum)
                {
                    System.out.println("Player2 Wins That Round!");
                    System.out.println( "  "   );
                }
                else
                {
                    System.out.println("That round was a Draw!");
                    System.out.println("  ");
                }

                if(Round == 3)
                    {

                        if(Player1Sum > Player2Sum)
                        {
                            System.out.println("Player1 Wins The Game with a score of " + Player1Sum + " to Player2's " + Player2Sum +"!");
                            System.out.println( "  "   );
                            winner = true;
                        }
                        else if(Player2Sum == Player1Sum)
                        {
                            System.out.println("It is a Draw, Play Again!");
                            winner = false;
                        }
                       else
                        {
                            System.out.println("Player2 Wins The Game with a score of " + Player2Sum + " to Player1's " + Player1Sum + "!");
                            System.out.println("  "    );
                            winner = true;

                        }
                    }
                else
                {
                    winner = false;
                }

            }while(!winner);


            System.out.println("Would you Like to Play Again? (Y for yes, anything else for no)");
            System.out.println("  ");
            PlayAgain = in.nextLine();
            if(PlayAgain.equalsIgnoreCase("Y"))
            {
                yesno = true;
            }
            else
            {
                yesno = false;
            }
        }while(yesno);

        System.out.println("Thank You for Playing!");


    }
}
