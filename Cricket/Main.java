#include<iostream>
using namespace std;
int main()
{
  int z;
  float x,y,w,a,b;
  float c;
  cin>>w>>x>>y>>z;
  a = w/6;
  float e = z%6;
  b = (z/6)+(e/10);
  c = x/a*10;
  int h = c+0.6;
  float p = h/10.0;
  float d = y/b*10;
  int g = d+0.6;
  float f = g/10.0;
  
  cout<<a;
  cout<<"\n"<<b;
  cout<<"\n"<<f;
  cout<<"\n"<<p;
  (f>p)?cout<<"\nEligible to Win":cout<<"\nNot Eligible to Win";
}