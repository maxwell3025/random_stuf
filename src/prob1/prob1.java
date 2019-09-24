package prob1;

public class prob1 {
	public static boolean testpower(double in) {
		double working = in;
		while (in > 1) {
			in = in / 2;
		}
		return in == 1;
	}

	public static void main(String[] args) {
		int number = 0;
		int i = 0;
		while (true) {
			i = i + 1;
			number = 100 * i - 2;
			for (int x = 0; x < number; x++) {
				if (testpower(number - x) && testpower(x)) {
					System.out.println("total-" + (number + 2));
					System.out.println("red-" + (x + 1));
					System.out.println("white-" + (number - x + 1));
					break;
				}
			}
		}
	}
}
