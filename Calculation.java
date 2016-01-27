package com.GuessNumber.Calculation;

import java.util.Random;
import java.util.Scanner;

import com.GuessNumber.View.ViewText;

public class Calculation
{

	public void runProgram()
	{
		Random random = new Random();
		int variate = random.nextInt(101);
		ViewText.explanation();
		Scanner scanner = new Scanner(System.in);
		int play = scanner.nextInt();
		testVariantsOfGuessResult(variate, scanner, play);
	}

	public void testVariantsOfGuessResult(int variate, Scanner scanner, int play)
	{
		for (int i = 0; i < 6;)
		{
			if (play == variate)
			{
				ViewText.win();
				break;
			} else if (play > variate)
			{
				ViewText.numberIsLower();
				play = scanner.nextInt();
				i++;
			} else if (play < variate)
			{
				ViewText.numberIsHigher();
				play = scanner.nextInt();
				i++;
			}
			if (i == 6)
			{
				ViewText.outOfAttempts();
			}
		}
		scanner.close();
	}
}
