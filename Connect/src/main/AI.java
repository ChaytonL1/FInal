package main;

import java.util.Random;

import main.CallArray;

public class AI {
	
	public static void AI() 
	{
		
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
