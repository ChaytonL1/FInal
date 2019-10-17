public class PlainBoard 
{
   public static void displayBoard() 
   {
   }
    public static void displayBetterBoard() 
    {
    	
    	//Displays big board
    	
		for(int j =0; j< 15; ++j) 
		{
		System.out.println("|	  			 |			    			|				|");
		}
		for (int i = 0; i < 113; ++i) 
		{
			System.out.print("_");
		}
		for (int j = 0; j < 15; ++j ) 
		{
		System.out.println("|	  			 |			    			|				|");
		}
		for (int i = 0; i < 113; ++i) 
		{
			System.out.print("_");
		}
		for(int j =0; j< 15; ++j) 
		{
		System.out.println("|	  			 |			    			|				|");
		}
		for (int i = 0; i < 113; ++i) 
		{
			System.out.print("_");
		}
		
		//Spacing between the boards
		
		System.out.println(" ");
		
		//Displays small board
		
    	int[] a = new int[9];
        a[0] = a[5] = a[6] = 10;
        a[3] = a[7] = 100;
        a[1] = a[2] = a[4] = a[8] = 0;
        String[] b = new String[9];
        int x = 0;

        while (x < a.length) {
            if (a[x] == 10)
                b[x] = "X";
            else if (a[x] == 100)
                b[x] = "O";
            else if (a[x] == 0)
                b[x] = " ";
            x++;
        }
        System.out.println("+---+---+---+");
        System.out.println("| " + b[0] + " | " + b[1] + " | " + b[2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + b[3] + " | " + b[4] + " | " + b[5] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + b[6] + " | " + b[7] + " | " + b[8] + " |");
        System.out.println("+---+---+---+");

		
    }
}

