public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(_hasCapital_("null"));
		System.out.println(_isPrime_(37));

	}

	public static boolean _hasCapital_(String word) {
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

	public static boolean _isPrime_ (int num) {
		boolean flag = false;

		for (int i = 2; i <= num; i++) { //start at 2, b/c 1 is not prime
			if (!(num % 2 == 0)) {
				flag = true;
			}
		}
		return flag;


	}


}
