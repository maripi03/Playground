#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x;
  y = x%10;
  z = y+(x/1000);
  cout<<z;
}