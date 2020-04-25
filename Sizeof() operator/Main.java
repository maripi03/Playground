#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  char c;
  double d;
  int w = sizeof(a);
  int x = sizeof(b);
  int y = sizeof(c);
  int z = sizeof(d);
  cout<<y<<"\n"<<w<<"\n"<<x<<"\n"<<z;
}