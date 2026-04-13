public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(hasCapital("hello"));
		System.out.println(isPrime(7));

	}

	public static boolean hasCapital(String word) {
		boolean flag = false;
		int character = 0;

		for(int i = 0; i < word.length(); i++) {

			character = word.charAt(i); //ascii value

			if (character >= 65 && character <= 90) {
				flag = true;
			}
		}
		return flag;
	}

	public static boolean isPrime (int num) {
		boolean flag = true;

		if (num == 1) {
			return flag = false;
		}

		for (int i = 2; i <= num; i++) { //start at 2, b/c 1 is not prime
			if (num % 3 == 0) {
				flag = false;
			}
		}
		return flag;


	}


}
