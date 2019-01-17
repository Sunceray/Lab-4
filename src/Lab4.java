import java.util.Scanner; 

public class Lab4 {
	
	public static void  main(String[] args )   {
		Scanner scnr = new Scanner(System.in);
		
		    
		    int number = 1;
	        int square;
	        int cube;
	        int squareNumber;
	        int cubeNumber;
	        String name1 = "y";
		
		System.out.print("Learn Your Squares And Cubes!");;
		String name = scnr.nextLine();
		System.out.println(name + " ");
		
		
		System.out.println("What's your favorite number?");
		String name11 = scnr.nextLine();
		System.out.println(name11 + " ");
		
		System.out.println("Great! Now, Here are your results");
		String name2 = scnr.nextLine();
		System.out.println(name2 + " ");
		
		System.out.println("\nNumber\tSquare\tCubes");
		

		while (number <= 20) {

            square = number * number;
            cube = square * number;
            System.out.printf(" %2d %7d %7d\n"
            		+ "", number, square, cube);
            number++;
        }
		
		    System.out.println(" ");
			System.out.println("Want to continue? Type YES! ");
            Scanner input = null;
         
 
		
	  
	}
		


	private static int cubesNumber(int number, int square) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int squareNumber(int number) {
		// TODO Auto-generated method stub
		return 0;
	}
}


