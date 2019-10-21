package main;

import java.util.Random;
import java.util.Scanner;
import main.CallArray;
import main.AI;

public class testBoard {
	public static String [] slots = {"1","2","3","4","5","6","7","8","9"};


	public static void User(String[] args) {
//		 TODO Auto-generated method stub
		        
	        String user; 
	        
	        for (int j = 0; j < slots.length; j++) {
        		System.out.print(slots[j] + " ");
        		if(slots[j].equals("3") || slots[j].equals("6")) {	
        			System.out.println();
        		}
	        }
	        System.out.println();
        		
	        System.out.println(" Your turn, where would you like to place your coin? ");
	     
			Scanner input = new Scanner(System.in);
			user = input .next();
	        // Display Choice  
			for(int x = 0; x < slots.length; ++x) {
				if(user.equals(slots[x])) {
					slots[x] = "X";
				}
			}
	        for (int i = 0; i < slots.length; i++) {
        		System.out.print(slots[i] + " ");
        		if(slots[i].equals("3") || slots[i].equals("6")) {	
        			System.out.println();
        			
        		}
        }
	        
	        AI(slots);
	}
	public static void AI(String slots[]) 
	{
		System.out.println(" The AI's turn... ");
		System.out.println(" ");
		String [] arr = {"1","2","3","4","5","6","7","8","9"};
		boolean computer = true;
		Random r=new Random();
		int randomNumber = r.nextInt(arr.length);
		while(computer = true)
		if (slots[randomNumber].equals("O") || slots[randomNumber].equals("X"))
		{
		computer = true;
		}
		else 
		{
			for(int x = 0; x < slots.length; ++x) {
				if(arr[randomNumber].equals(slots[x])) {
					slots[x] = "O";
		computer = false;
		}
		}
			 for (int i = 0; i < slots.length; i++) {
					System.out.print(slots[i] + " ");
					if(slots[i].equals("3") || slots[i].equals("6")) {	
						System.out.println();
	  }			
	}			
  }
}
}
	




