import java.util.Scanner;


/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		// Clear terminal
		System.out.print("\033[H\033[J");
		Scanner scan = new Scanner(System.in);

		int firstNumber = 0, secondNumber = 0, result = 0;
		String resultStr = "";

		System.out.print("Enter the first number\n: ");
		String firstNumberInput = scan.next();

		System.out.print("Enter the operation\n: ");
		String oper = scan.next();

		System.out.print("Enter the second number\n: ");
		String secondNumberInput = scan.next();


		if (firstNumberInput.equals("X"))
			firstNumber = 10;
		else if (firstNumberInput.equals("IX"))
			firstNumber = 9;
		else if (firstNumberInput.equals("VIII"))
			firstNumber = 8;
		else if (firstNumberInput.equals("VII"))
			firstNumber = 7;
		else if (firstNumberInput.equals("VI"))
			firstNumber = 6;
		else if (firstNumberInput.equals("V"))
			firstNumber = 5;
		else if (firstNumberInput.equals("IV"))
			firstNumber = 5;
		else if (firstNumberInput.equals("III"))
			firstNumber = 3;
		else if (firstNumberInput.equals("II"))
			firstNumber = 2;
		else if (firstNumberInput.equals("I"))
			firstNumber = 1;
		else
			firstNumber = Integer.parseInt(firstNumberInput);


		if (secondNumberInput.equals("X"))
			secondNumber = 10;
		else if (secondNumberInput.equals("IX"))
			secondNumber = 9;
		else if (secondNumberInput.equals("VIII"))
			secondNumber = 8;
		else if (secondNumberInput.equals("VII"))
			secondNumber = 7;
		else if (secondNumberInput.equals("VI"))
			secondNumber = 6;
		else if (secondNumberInput.equals("V"))
			secondNumber = 5;
		else if (secondNumberInput.equals("IV"))
			secondNumber = 4;
		else if (secondNumberInput.equals("III"))
			secondNumber = 3;
		else if (secondNumberInput.equals("II"))
			secondNumber = 2;
		else if (secondNumberInput.equals("I"))
			secondNumber = 1;
		else 
			secondNumber = Integer.parseInt(secondNumberInput);



		if (oper.equals("+"))
			result = firstNumber + secondNumber;
		else if (oper.equals("-"))
			result = firstNumber - secondNumber;
		else if (oper.equals("*"))
			result = firstNumber * secondNumber;
		else if (oper.equals("/"))
			result = firstNumber / secondNumber;


		for (int i = 0; i < 1; i++) {
			if (firstNumberInput.charAt(0) == 'I' 
			|| firstNumberInput.charAt(0) == 'V' 
			|| firstNumberInput.charAt(0) == 'X' 
		 	|| secondNumberInput.charAt(0) == 'I' 
			|| secondNumberInput.charAt(0) == 'V' 
			|| secondNumberInput.charAt(0) == 'X') {

				if (isChar(firstNumberInput) == isChar(secondNumberInput)) {

					if (result == 0)
						resultStr = "O";
					else if (result == 1)
						resultStr = "I";
					else if (result == 2)
						resultStr = "II";
					else if (result == 3)
						resultStr = "III";
					else if (result == 4)
						resultStr = "IV";
					else if (result == 5)
						resultStr = "V";
					else if (result == 6)
						resultStr = "VI";
					else if (result == 7)
						resultStr = "VII";
					else if (result == 8)
						resultStr = "VIII";
					else if (result == 9)
						resultStr = "IX";
					else if (result == 10)
						resultStr = "X";
					else if (result < 0)
						System.out.println("There are no negative numbers in the Roman system");
					else
						resultStr = firstNumberInput + secondNumberInput;

					System.out.println("\nResult: " + resultStr + "\n");
					
				} else 
					System.out.println("\nUse different number systems at the same time\n");
				
				
			}
			else
				System.out.println("\nResult: " + result + "\n");
		}
	}

	private static boolean isChar(String str) {
		if (str.equals("I"))
			return true;
		if (str.equals("II"))
			return true;
		if (str.equals("III"))
			return true;
		else if (str.equals("IV"))
			return true;
		else if (str.equals("V"))
			return true;
		else if (str.equals("VI"))
			return true;
		else if (str.equals("VII"))
			return true;
		else if (str.equals("VIII"))
			return true;
		else if (str.equals("IX"))
			return true;
		else if (str.equals("X"))
			return true;
		else
			return false;
	}
}