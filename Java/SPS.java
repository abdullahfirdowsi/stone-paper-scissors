import java.util.Scanner;
import java.util.Random;
public class SPS 
{
public static void main(String[] args)
{
while(true)
{
   String personPlay;
   String computerPlay = "";
   int computerInt;
   String response;
   String play_again;

   Scanner scan = new Scanner(System.in);
   Random generator = new Random();

   System.out.print("Enter a choice (rock, paper, scissors): ");
   computerInt = generator.nextInt(3)+1;

   if (computerInt == 1)
      computerPlay = "rock";
   else if (computerInt == 2)
      computerPlay = "paper";
   else if (computerInt == 3)
      computerPlay = "scissors";

   personPlay = scan.next();

   //Make player's play uppercase for ease of comparison
   personPlay = personPlay.toLowerCase();

   //Print computer's play
   System.out.println("You chose " + personPlay + ", computer chose " + computerPlay);


   //See who won. Use nested ifs

   if (personPlay.equals(computerPlay))
   {
      System.out.println("It's a tie!");
   }
   else if (personPlay.equals("rock"))
   {
      if (computerPlay.equals("scissors"))
      {
         System.out.println("Rock smashes scissors! You win!");
      }
      else if (computerPlay.equals("paper"))
      {
           System.out.println("Paper covers rock! You lose.");
      }
   }
   else if (personPlay.equals("paper")){
      if (computerPlay.equals("scissors"))
      {
         System.out.println("Scissors cuts paper! You lose.");
      }
      else if (computerPlay.equals("rock"))
      { 
         System.out.println("Paper covers rock! You win!");
      }
   }
   else if (personPlay.equals("scissors")){
        if (computerPlay.equals("paper"))
        {
           System.out.println("Scissors cuts paper! You win!");
        }
        else if (computerPlay.equals("rock"))
        {
           System.out.println("Rock smashes scissors! You lose.");
        }
   }
   else
   {
        System.out.println("Invalid user input.Try again!!");
   }

   
  System.out.print("Play again? (yes/no): ");
  play_again = scan.next();
  play_again = play_again.toLowerCase();
  if (!play_again.equals("yes")){
	break;
  }	

  }
 }
}

