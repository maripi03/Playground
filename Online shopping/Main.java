#include<iostream>
using namespace std;
int main()
{
  int x1,x2,x3,y1,y2,y3,z1,z2,z3,a,b,c;
  cin>>x1>>x2>>x3>>y1>>y2>>y3>>z1>>z2>>z3;
  a = x1-(x1*x2/100)+x3;
  b = y1-(y1*y2/100)+y3;
  c = z1-(z1*z2/100)+z3;
  cout<<"In Flipkart Rs."<<a;
  cout<<"\nIn Snapdeal Rs."<<b;
  cout<<"\nIn Amazon Rs."<<c;
  switch(a<=b && a<=c)
  {
    case 1: cout<<"\nHe will prefer Flipkart";
      break;
    case 0: switch(b<=a && b<=c)
    {
      case 1:cout<<"\nHe will prefer Snapdeal";
        break;
      case 0:cout<<"\nHe will prefer Amazon";
        break;
    }
      break;
  }
  
  
}