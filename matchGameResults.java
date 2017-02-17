
import java.util.Scanner;

public class matchGameResults{

		public static void main(String[] args) {

			//Scanner in = new Scanner(System.in);
			//System.out.print("How many Games are being played?");
			//String userInput = in.nextInt();

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

		    for (int i = 0; i < arr.length; ++i){
		        for (int j = 0; j < arr[i].length; ++j)
		            System.out.print(arr[i][j] + "\t");
		    }		
			System.out.println();
		}

}
