#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	vector<int> n(5);
	for (int i = 0; i < n.size(); i++)
		cin >> n[i];
	cout << *min_element(n.begin(), n.end()) << endl;
	return 0;
}
