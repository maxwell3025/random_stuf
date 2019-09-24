package prob1;

public class prob2 {
	public static boolean validate(int jim) {
		boolean blob = true;
		String s = Integer.toString(jim);
		char[] dig = s.toCharArray();
		int previousDigit = 0;
		for (int i = 0; i < dig.length; i++) {
			int currentDigit = Integer.parseInt(String.valueOf(dig[i]));
			if (currentDigit <= previousDigit) {
				blob = false;
				break;
			}
			previousDigit = currentDigit;
		}

		return blob;
	}

	public static void main(String[] args) {
		int i = 100;
		while (true) {
			if (validate(i) && validate(i * i)) {
				System.out.println(i + " sq: " + i*i);
				break;
			}
			
			i++;
		}
	}

}
