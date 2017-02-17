
import java.util.Scanner;

public class matchGameResults{

		public static void main(String[] args) {

			Scanner userInputScanner = new Scanner(System.in);
			System.out.print("Whats your name?");
			String userInput = userInputScanner.nextInt();

			int arr[][] = { 
							{ 1, 1 }, 
							{ 1, 0 }, 
							{ 1, -1 }, 
							{ 0, 1 }, 
							{ 0, 0 },
							{ -1, 1 }, 
							{ -1, 0 }, 
							{ -1, -1 } 
						};

		    for (int i = 0; i < 8; ++i){
		        for (int j = 0; j < 2; ++j)
		            System.out.print(arr[i][j] + " ");
		    }		
			System.out.println();
		}

}

