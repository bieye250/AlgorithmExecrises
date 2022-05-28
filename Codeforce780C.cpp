#include<iostream>

using namespace std;

#define ll long long

int main(){
	int a = 1<<30;
	long b = (long)a + a;
	cout << b << endl;
}