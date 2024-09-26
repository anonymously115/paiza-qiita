using System;

public class Program
{
	private static int b;

	private static string lottery(int a)
	{
		if (a == b) return "first";
		if (Math.Abs(a - b) == 1) return "adjacent";
		if ((a - b) % 10000 == 0) return "second";
		if ((a - b) % 1000 == 0) return "third";
		return "blank";
	}

	public static void Main()
	{
		b = int.Parse(Console.ReadLine());
		int n = int.Parse(Console.ReadLine());
		while (n-- > 0) Console.WriteLine(lottery(int.Parse(Console.ReadLine())));
	}
}
