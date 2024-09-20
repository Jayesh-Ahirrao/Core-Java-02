package Main;

public class Main {

	public static void main(String[] args) {
		// insufficient args | string as number | zero
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int ans = num1 / num2;
			System.err.println(ans);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			System.out.println("Provide 2 arguments");
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
			System.out.println("Invalid input given, expented Integer");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			System.out.println("0 for deno not allowed");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("something went wrong !");
		} finally {
			System.out.println("\nFrom Finally");
		}
	}
}

//ArrayIndexOutOfBoundsException
//NumberFormatException
//ArithmeticException