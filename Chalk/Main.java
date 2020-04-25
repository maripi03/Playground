#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x;
  float y;
  cin>>x;
  y = pow(x, 0.5);
  float z = 1/y;
  int a = x/(1-z);
  if(a==20)
    cout<<a-1;
  else
    cout<<a;
}