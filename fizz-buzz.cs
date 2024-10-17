using System;

public class Program
{
	private static string FizzBuzz(int i)
	{
		if (i % 3 == 0 && i % 5 == 0) return "Fizz Buzz";
		if (i % 3 == 0) return "Fizz";
		if (i % 5 == 0) return "Buzz";
		return i.ToString();
	}

	public static void Main()
	{
		int n = int.Parse(Console.ReadLine());
		for (int i = 1; i <= n; i++) Console.WriteLine(FizzBuzz(i));
	}
}
