using System;

public class Program
{
	public static void Main()
	{
		int[] XYZ = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
		int X = XYZ[0];
		int Y = XYZ[1];
		int Z = XYZ[2];
		string[][] S = new string[Z][];
		for (int z = 0; z < Z; z++) {
			S[z] = new string[X];
			for (int x = 0; x < X; x++)
			{
				S[z][x] = Console.ReadLine();
			}
			Console.ReadLine();
		}
		while (Z-- > 0)
		{
			string t = string.Empty;
			for (int y = 0; y < Y; y++) {
				char c = '.';
				for (int x = 0; x < X; x++) {
					if (S[Z][x][y] == '#') {
						c = '#';
						break;
					}
				}
				t += c;
			}
			Console.WriteLine(t);
		}
	}
}
