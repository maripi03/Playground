#include<iostream>
using namespace std;
int main()
{
  int x;
  double y;
  cin>>x>>y;
  float z;
  switch(x==2)
  {
    case 1:cout<<y+(y*0.50);
      break;
    case 0: switch(x==3)
    {
      case 1: 
        z = y*2.00;
        cout<<z;
        break;
      case 0:cout<<"Number of items is more";
        break;
    }
      break;
  }
}