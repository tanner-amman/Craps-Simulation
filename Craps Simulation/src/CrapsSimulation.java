import java.util.Scanner;

public class CrapsSimulation
	{
		static int dice1;
		static int dice2;
		static int diceTotal;
		static int point1;
		static int playerMoney = 100;
		static int bet;
		public static void main(String[] args)
			{
				boolean playAgain = true;
				boolean point = true;
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
				while (playAgain)
					{
						System.out.println("You have a total of " + playerMoney + ", how much would you like to bet?");
						Scanner gamble = new Scanner(System.in);
						bet = gamble.nextInt();
						dice1 = (int)(Math.random() * 6) + 1;
						dice2 = (int)(Math.random() * 6) + 1;
						diceTotal = dice1 + dice2;
						System.out.println("Press enter to roll your dice!");
						Scanner rollDice = new Scanner(System.in);
						String roll = rollDice.nextLine();
						if (diceTotal == 7 || diceTotal == 11)
							{
								System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal + ". You win " + name + "!");
								playerMoney = playerMoney + bet;
								System.out.println("You now have a total of " + playerMoney + ".");
								point = false;
							}
						else if (diceTotal == 2 || diceTotal == 12)
							{
								System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal + ". You lose " + name + "!");
								point = false;
							}
						else 
							{
								System.out.println("You rolled a " + dice1 + " and a " + dice2 + ". Your point is " + diceTotal + ", " + name + ".");
								point1 = diceTotal;
								
							}
						while (point)
							{
								System.out.println("Press enter to roll again!");
								Scanner newRoll = new Scanner(System.in);
								String roll2 = newRoll.nextLine();
								dice1 = (int)(Math.random() * 6) + 1;
								dice2 = (int)(Math.random() * 6) + 1;
								diceTotal = dice1 + dice2;
								if (diceTotal == point1)
									{
										System.out.println("Your point is " + point1 + ", and you rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal + ". You win " + name + "!");
										point = false;
									}
								else if (diceTotal == 7)
									{
										System.out.println("Your point is " + point1 + ", but you rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal + ". You lose " + name + "!");
										point = false;
									}
								else 
									{
										System.out.println("Your point is " + point1 + ", and you rolled a " + dice1 + " and a " + dice2 + " for a total of " + diceTotal + ".");
									}
							}
						Scanner userInput4 = new Scanner(System.in);
						System.out.println("Would you like to play again? Please answer \"Yes\" or \"No\"");
						String play = userInput4.nextLine();
						play = play.toUpperCase();
						if (play.equals("YES"))
							{
								System.out.println("Ok " + name + ", here we go again!");
								point = true;
							} else if (play.equals("NO"))
							{
								System.out.println("Ok thanks for playing!");
								playAgain = false;
							}
					}

			}

	}
