import java.util.*;
public class Game{
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        Random comp_choice = new Random();
        while(true){
            System.out.print("Enter your choice: ");
            String player_move = choice.nextLine();
            int computer = comp_choice.nextInt(3);
            String move;
            if (computer == 0){
                move = "Rock";

            }
            else if (computer == 1){
                move = "Paper";

            }
            else{
                move = "Scissors";
            }
            System.out.println("Computer's move: " + move);
            if (player_move.equals(move)){
                System.out.println("It's a tie");
            }
            else if(player_move.equals("Paper") && move.equals("Rock")){
                System.out.println("Paper beats Rock, you win");
            } else if(player_move.equals("Scissors") && move.equals("Paper")){
                System.out.println("Scissors beat Paper,you win");
            } else if(player_move.equals("Rock") && move.equals("Scissors")){
                System.out.println("Rock beats Scissors,you win");
            }
            else{
                System.out.println("You lose");
            }
            System.out.println("Do you want to play again(Yes/No): ");
            String play_again = choice.nextLine();
            if(!play_again.equals("Yes")){
                break;
            }
        }
        System.out.println("Thank you for playing \n If possible, try to give a positive feedback \n Please Fuck Off");

    }
}
