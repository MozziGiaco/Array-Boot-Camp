import java.util.Scanner;

public class ArrayBootCamp
	{
		static int number;

		public static void main(String[] args)
			{
				// printSweets();
				// insertEightNumbers();
				generateRandomNumber();
			}

		private static void printSweets()
			{
				System.out.println("How many favorite sweets do you have?");
				Scanner userInput = new Scanner(System.in);
				Scanner sweetsInput = new Scanner(System.in);
				int sweetsNumber = userInput.nextInt();
				String[] favoriteSweets = new String[sweetsNumber];

				for (int i = 0; i < sweetsNumber; i++)
					{

						System.out.println("Enter a sweet");
						String sweet = sweetsInput.nextLine();

						favoriteSweets[i] = sweet;

					}
				for (String f : favoriteSweets)
					{
						System.out.println("Your favorite sweets are: " + f);
					}

			}

		private static void insertEightNumbers()
			{
				Scanner intInput = new Scanner(System.in);

				int[] numberList = new int[8];

				int sumEven = 0;
				int sumOdd = 0;

				for (int i = 0; i < 8; i++)
					{
						System.out.println("Enter your number");

						number = intInput.nextInt();

						numberList[i] = number;

						if (number % 2 == 0)
							{
								sumEven += numberList[i];
							}
						else
							{
								sumOdd += numberList[i];
							}

					}

				System.out.println("The sum of all the even numbers is " + sumEven);
				System.out.println("The sum of all the odd numbers is " + sumOdd);

			}

		private static void generateRandomNumber()
			{
				System.out.println("Please input five random two digit numbers.");
			}

	}
