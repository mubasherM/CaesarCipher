/**
 * App to demonstrate the use of the break statement.
 */
package courseWork;

/**
 * @author cbpos1989
 *
 */
import java.util.Scanner;

public class BreakApp{
	int userNumber = 0;
	private Scanner scan;

	public static void main(String[] args){
		System.out.println("Working");
		BreakApp myBreakApp = new BreakApp();
		myBreakApp.dataInput();
		myBreakApp.isEven();
		myBreakApp.runLoop(myBreakApp.userNumber);
		
		
	}
	
	void dataInput(){
		scan = new Scanner(System.in);
		System.out.print("Enter Number at which to end loop: ");
		String userInput = scan.nextLine();
		userNumber = Integer.parseInt(userInput);
	}

	boolean isEven(){
		int num = userNumber;
		return((num%2 == 0));
		
	}
	
	void runLoop(int numInput){
		if(isEven() == true){
			for (int i = 1; i < 101; ++i) {
			
				if (i == numInput) {
					System.out.println("\nFound Index Number " + i);break;
				} else {
					if ((i%2) != 0) {
						continue;
					} else {
						for(int j = 0; j < 10; ++j){
							System.out.print(i + "." + j + " ");
						}
						
						System.out.print(i + " ");
					}
				}
			
			}

			System.out.println("Your Number was Even");
		} else {
			System.out.println("Your Number was odd");
		}
	}
}
