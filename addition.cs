using System;

public class Program
{
	public static void Main()
	{
		int[] ab = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
		int a = ab[0];
		int b = ab[1];
		Console.WriteLine(a + b);
	}
}
