import java.util.Scanner;
public class chargrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter char: ");
		String letter1 = kb.next();
		
		char letter = letter1.charAt(0);
		
		switch (letter)
		{
			case 'A', 'a':
			case 'B', 'b':
				System.out.println("You are doing good!");
				break;
			case 'C', 'c':
			case 'D', 'd':
				System.out.println("You need to study more!");
				break;
			default:
				System.out.println("Maybe next time!");
			
		}
		kb.close();
	}

}