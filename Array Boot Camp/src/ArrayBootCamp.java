import java.util.Scanner;

public class ArrayBootCamp
	{

		public static void main(String[] args)
			{
				printSweets();
				insertEightNumbers();
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

						System.out.println(favoriteSweets[i]);

					}

			}

		private static void insertEightNumbers()
			{

			}

		private static void generateRandomNumber()
			{

			}

	}
