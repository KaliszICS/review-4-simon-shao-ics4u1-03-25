import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = "5" + input.nextLine();
		System.out.println(Integer.parseInt(word) + 5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String word = "4" + input.nextLine() + "3";
		System.out.println(Double.parseDouble(word) + 3.4);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String word = input.nextLine();
		System.out.println(!Boolean.parseBoolean(word));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = input.nextLine() + "3";
		int num = Integer.parseInt(word) + 2;
		System.out.println((char)num);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String word = input.nextLine() + "1";
		int num = Integer.parseInt(word) / 2;
		System.out.println((double)num);
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String word = "1" + input.nextLine();
		double number = Double.parseDouble(word);
		System.out.println((int)number);
	}

}
