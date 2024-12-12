#include <iostream>
#include <vector>
using namespace std;

int main() {
	int X, Y, Z;
	cin >> X >> Y >> Z;
	vector<vector<string>> S(Z, vector<string>(X));
	for (int z = 0; z < Z; z++) {
		for (int x = 0; x < X; x++) {
			cin >> S[z][x];
		}
		string bar;
		cin >> bar;
	}
	while (Z--) {
		string t;
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
		cout << t << endl;
	}
	return 0;
}
