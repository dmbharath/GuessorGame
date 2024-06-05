import java.util.Scanner;
    
class Guessor
{
    int guessNum;
    int guessNum()
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Guessor kindly guess the number ");
        while(true)
        {
            guessNum = sc.nextInt();
            if(guessNum >= 1 && guessNum <= 10)
            {
                return guessNum;
            }
            else 
            {
                System.out.println("Please guess a number in between 1 to 10");
            }
        }
    }
}
    
class Players
{
    int guessNum;
    int guessNum()
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Players kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Umpire
{
    int numFromGuessor;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    void collectFromGuessor()
    {
        Guessor g = new Guessor();
        numFromGuessor = g.guessNum();
    }
    void collectFromPlayers()
    {
        Players p1 = new Players();
        Players p2 = new Players();
        Players p3 = new Players();
        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();
    }
    void compare()
    {
        if(numFromGuessor == numFromPlayer1)
        {
            if(numFromGuessor == numFromPlayer2 && numFromGuessor == numFromPlayer3)
            {
                System.out.println("All the players won the game");
            }
            else if(numFromGuessor == numFromPlayer2)
            {
                System.out.println("Player 1 and 2 won the game");
            }
            else if(numFromGuessor == numFromPlayer3)
            {
                System.out.println("Player 1 and 3 won the game ");
            }
            else
            {
                System.out.println("Player1 won the game");
            }
        }
        else if(numFromGuessor == numFromPlayer2)
        {
            if(numFromGuessor == numFromPlayer3)
            {
                System.out.println("Player 2 and 3 won the game");
            }
            else 
            {
                System.out.println("Player2 won the game");
            }
        }
        else if(numFromGuessor == numFromPlayer3)
        {
            System.out.println("Player3 won the game ");
        }
        else 
        {
            System.out.println("Game lost try again");
        }
    }
}
public class GuessorGame 
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address :");
        @SuppressWarnings("unused")
        String email = sc.nextLine();
        // System.out.println(email);
        System.out.println("Enter you password : ");
        @SuppressWarnings("unused")
        String password = sc.nextLine();
        // System.out.println(password);
        
        Umpire u = new Umpire();
        u.collectFromGuessor();
        u.collectFromPlayers();
        u.compare();
    }
}

