import java.util.*;

class Pass_set {
	String name;
	int year;
	Scanner sc = new Scanner(System.in);

	// method for generating random password of length given by user

	void rand() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String symb = "@#$*_-!";
		String combination = upper + lower + symb + num;
		System.out.println(
				"you have chosen this to create a password including random character of your convenient length");
		System.out.println();
		System.out.println("what should be the length of your password?");
		int x = sc.nextInt();
		char[] pass = new char[x];
		Random r = new Random();
		for (int i = 0; i < x; i++) {
			pass[i] = combination.charAt(r.nextInt(combination.length()));
		}
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
		System.out.println("generated password: " + new String(pass));
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
	}

	// method to generate password including your name and your birth year

	void nameyear() {
		System.out.println("you have chosen this to create a password including your name and birth year");
		System.out.println();
		System.out.println("enter your name"); // getting name of user
		name = sc.nextLine();
		String s = name.toUpperCase();
		System.out.println("enter your birth year"); // getting birth year of user
		year = sc.nextInt();
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
		System.out.println("generated password: " + s + "_" + year);
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
	}

	// method to generate password of random 4 digit

	void rand4() {
		System.out.println("you have chosen this to create a password including random 4 digit");
		long ran4 = (long) (Math.random() * 10000);
		String s = Long.toString(ran4);
		if (s.length() == 3) {
			s = "0" + s;
		}
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
		System.out.println("generated password: " + s);
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
	}

	// method to generate password of random 6 digit

	void rand6() {
		System.out.println("you have chosen this to create a password including random 6 digit ");
		long ran6 = (long) (Math.random() * 1000000);
		String s2 = Long.toString(ran6);
		System.out.println();
		if (s2.length() == 5) {
			s2 = "0" + s2;
		}
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
		System.out.println("generated password: " + s2);
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
	}

	// method to generate password including surname and birth date

	void surdate() {
		System.out.println("you have chosen this to create a password including your surname and birth date ");
		System.out.println();
		System.out.println("enter your surname"); // getting surname of user
		String surname = sc.nextLine();
		String s = surname.toUpperCase();
		System.out.println("enter your birth date(format:ddmmyyyy)"); // getting birthdate of user
		String date = sc.nextLine();
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
		System.out.println("generated password: " + s + "_" + date);
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
	}
}

class main // main class for execution
{
	public static void main(String args[]) {
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
		System.out.println("WELCOME TO PASSWORD GENERATOR");
		System.out.println();
		System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
		System.out.println();
		boolean f = true;
		while (f) {
			Scanner sc = new Scanner(System.in);
			System.out.println("what kind of password do u want?"); // giving options to user which kind of password he
																	// wants
			System.out.println("1.random password of your given length(capitial letters/small letters/numbers)");
			System.out.println("2.password including your name and your birth year");
			System.out.println("3.password including random 4 numbers");
			System.out.println("4.password including random 6 numbers");
			System.out.println("5.password including your surname and birthdate");
			System.out.println("6.exit");
			System.out.println();

			int n = sc.nextInt();
			Pass_set ob = new Pass_set();
			switch (n) {
				case 1:
					ob.rand(); // calling method to generate password of random characters
					break;
				case 2:
					ob.nameyear(); // calling method to generate password which includes name and year
					break;
				case 3:
					ob.rand4(); // calling method to generate password including random 4 digit
					break;
				case 4:
					ob.rand6(); // calling method to generate password including random 6 digit
					break;
				case 5:
					ob.surdate();
					break;
				case 6:
					System.out.println();
					System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
					System.out.println();
					System.out.println("thank u for visiting!!!");
					System.out.println();
					System.out.println("<<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<*<**<<");
					System.out.println();
					f = false;
					break;
				default:
					System.out.println();
					System.out.println("please enter valid input"); // if user enters invalid input,this will ask user
																	// to enter valid input
					System.out.println();

			}
		}
	}
}