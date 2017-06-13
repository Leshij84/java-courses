public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[2]);
		int result = 0;
		int error = 0;
//		String res = "Error";
		if (arg[1].equals("+")) {
		result = first + second;
		System.out.print("Sum ");
		error = 1;
		}
		if (arg[1].equals("-")) {
		result = first - second;
		System.out.print("Difference ");
		error = 1;
		}
		if (arg[1].equals("/")) {
		result = first / second;
		System.out.print("Division ");
		error = 1;
		}
		if (arg[1].equals("x")) {
		result = first * second;
		System.out.print("Multiplication ");
		error = 1;
		}
		if(error == 0) System.out.println("Error");
		else System.out.print(result);	
}
}