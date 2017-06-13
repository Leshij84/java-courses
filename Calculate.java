public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[2]);
		int result = 0;
		if (arg[1].equals("+")) {
		result = first + second;
		System.out.print("Sum ");
		}
		if (arg[1].equals("-")) {
		result = first - second;
		System.out.print("Difference ");
		}
		if (arg[1].equals("/")) {
		result = first / second;
		System.out.print("Division ");
		}
		if (arg[1].equals("++")) {
		result = first * second;
		System.out.print("Multiplication ");
		}
		System.out.print(result);	
}
}