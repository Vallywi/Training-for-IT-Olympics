import java.util.Scanner;

public class easyproblem3{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("");
	int a = scanner.nextInt();
	System.out.print("");
	int b = scanner.nextInt();
	System.out.print("");
	int c = scanner.nextInt();


	int largest = a;

	if(largest < b){
	largest = b;
	}

	if(largest < c){
	largest = c;
	}
	
	System.out.println("");

	System.out.println(largest);


}
}