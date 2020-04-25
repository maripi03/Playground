#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x;
  switch(x%4==0)
  {
    case 1: 
      switch (x%100==0 && x%400==0)
    {
      case 1:cout<<x<<" is a leap year";
        break;
      case 0:cout<<x<<" is a leap year";
        break;
    }
      break;
    case 0:cout<<x<<" is not a leap year";
      break;
  }
  
      
}