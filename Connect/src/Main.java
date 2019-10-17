import java.util.Scanner;
public class Main 
{
    public static void main (String[]args)
    {
    	int input;
    	Scanner userInput;
    	userInput = new Scanner(System.in);
    	
    	System.out.println("Do you want to play? 1 for yes 999 for no");
    	
    	input = userInput.nextInt();
    	if(input == 1)    	
    	{
    		//displaying board
    		PlainBoard.displayBetterBoard();
    	}   
    	else if (input == 999)
    	{
    		System.out.println("Your loss lul");
    	}
    	else
    	{
    		System.out.println("Cant read? ");
    	}
    }  0 
}
