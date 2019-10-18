package main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class CallArray {
	
	 public static String[][] array = {
		        {"1","2","3"},
		        {"4","5","6"},
		        {"7","8","9"} 
		        };
	
	 public static void DisplayArray()	 
	   {
		int [] slots = {1,2,3,4,5,6,7,8,9}; 
		int winner = 1;
	        for (int i = 0; i < array.length; i++) {
	        	for (int j = 0; j < array[i].length; j++) {
	        		System.out.print(" " + array[i][j] + " ");
	        	}
	        	System.out.println();
	        }
	        
	        ArrayList<String> list = new ArrayList<>();
	        Scanner input = new Scanner(System.in);
	        int user; 
	        System.out.println(" Your turn, where would you like to place your coin? ");
	        user = input.nextInt();
	        // Display Choice
	       
	        if (user == 1 ) 
	        { if ( slots[0] != 0 ) {
	        	array[0][0] = "X";
	        	slots[0] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        
	        if (user == 2 ) 
	        { if ( slots[1] != 0 ) {
	        	array[0][1] = "X";
	        	slots[1] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        if (user == 3 ) 
	        { if ( slots[2] != 0 ) {
	        	array[0][2] = "X";
	        	slots[2] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        if (user == 4 ) 
	        { if ( slots[3] != 0 ) {
	        	array[1][0] = "X";
	        	slots[3] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        if (user == 5 ) 
	        { if ( slots[4] != 0 ) {
	        	array[1][1] = "X";
	        	slots[4] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        if (user == 6 ) 
	        { if ( slots[5] != 0 ) {
	        	array[1][2] = "X";
	        	slots[5] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        if (user == 7 ) 
	        { if ( slots[6] != 0 ) {
	        	array[2][0] = "X";
	        	slots[6] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        if (user == 8 ) 
	        { if ( slots[7] != 0 ) {
	        	array[2][1] = "X";
	        	slots[7] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        if (user == 9 ) 
	        { if ( slots[8] != 0 ) {
	        	array[2][2] = "X";
	        	slots[8] = 0;
	        }
	        else
	        {
	        	System.out.println(" Slot is already taken.");
	        }
	        }
	        
	        for (int i = 0; i < array.length; i++) {
	        	for (int j = 0; j < array[i].length; j++) {
	        		System.out.print(" " + array[i][j] + " ");
	        	}
	        	System.out.println();
	        }
	        System.out.println(" ");
	   }
	   
	        
	     
	       
	        	public static void Computer()
	        	{
	    // AI
	        		int aiSlots [] = {1,2,3,4,5,6,7,8,9};
	        		int random;
	        		System.out.println(" The AI's turn... ");
	        	Random rand = new Random();
	        	random = rand.nextInt((9) + 1);
	        	if (random == 1 ) 
		        {
	        		if (aiSlots[0] != 0 ) {
		        	array[0][0] = "O";
		        	aiSlots[0] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
	        	else if (random == 2 ) 
	        	{
	        		if (aiSlots[1] != 0 ) {
		        	array[0][1] = "O";
		        	aiSlots[1] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
	        	else if (random == 3 ) 
	        	{
	        		if (aiSlots[2] != 0 ) {
		        	array[0][2] = "O";
		        	aiSlots[2] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
	        	else if (random == 4 ) 
	        	{
	        		if (aiSlots[3] != 0 ) {
		        	array[1][0] = "O";
		        	aiSlots[3] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
	        	else if (random == 5 ) 
	        	{
	        		if (aiSlots[4] != 0 ) {
		        	array[1][1] = "O";
		        	aiSlots[4] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
	        	else if (random == 6 ) 
	        	{
	        		if (aiSlots[5] != 0 ) {
		        	array[1][2] = "O";
		        	aiSlots[5] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
	        	else if (random == 7 ) 
	        	{
	        		if (aiSlots[6] != 0 ) {
		        	array[2][0] = "O";
		        	aiSlots[6] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
	        	else if (random == 8 ) 
	        	{
	        		if (aiSlots[7] != 0 ) {
		        	array[2][1] = "O";
		        	aiSlots[7] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
	        	else if (random == 9 ) 
	        	{
	        		if (aiSlots[8] != 0 ) {
		        	array[2][2] = "O";
		        	aiSlots[8] = 0;
	        		}
	        		else 
	        		{
	        			
	        		}
		        }
		        for (int a = 0; a < array.length; a++) {
		        	for (int b = 0; b < array[a].length; b++) {
		        		System.out.print(" " + array[a][b] + " ");
		   }
		        	System.out.println(" ");
       }
		        System.out.println(" ");
		        
}
}



	   
