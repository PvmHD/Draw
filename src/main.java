package yan;
import java.util.Scanner;


public class main {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 0;
		int column = 0;
		System.out.println("How many stars do you want?");
		int playerChoice = Integer.parseInt(input.nextLine());

		while(row < playerChoice){
					while (column < playerChoice){

			System.out.print("* ");
			column++;
			
		}
		column = 0;
		System.out.println();
		row++;

		}
		

		//skip a line

	
		
	}

}
