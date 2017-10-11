import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		System.out.println("Calculator: ");
		Calculator c = new Calculator();
		Scanner sc=new Scanner(System.in);
		String input;
		while (true) {
			input=sc.nextLine();
			char firstChar=input.charAt(0);
			if (firstChar=='e' || firstChar=='E' || firstChar=='q' || firstChar=='Q') {
				break;
			} if (firstChar=='a' || firstChar=='A') {
				c.AC();
			} else if (firstChar=='+' || firstChar=='-' || firstChar=='*' || firstChar=='/') {
				c.EnterOperator(firstChar);
			} else if (firstChar=='=') {
				c.EnterEquals();
			} else {
				c.EnterNumber(Float.parseFloat(input));
			}
		}
		System.out.println("Thank you");
	}

}
