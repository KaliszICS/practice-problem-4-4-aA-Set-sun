public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(_hasCapital_("nuLL"));
		System.out.println(_isPrime_(1));

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

		for (int i = 0; i < 20; i++) {
			if (!(i % 2 == 0)) {
				flag = true;
			}
		}
		return flag;


	}


}
