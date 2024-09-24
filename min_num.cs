using System;
using System.Linq;

public class Program
{
	public static void Main()
	{
		int[] num = new int[5];
		for (int i = 0; i < num.Length; i++) num[i] = int.Parse(Console.ReadLine());
		Console.WriteLine(num.Min());
	}
}
