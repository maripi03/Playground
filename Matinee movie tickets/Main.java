#include<iostream>
using namespace std;
int main()
{
  int x;
  float y;
  cin>>x>>y;
  switch(y>13 && y<14)
  {
    case 1: switch(x>=13)
    {
      case 1:cout<<"$5.00";
        break;
      case 0:cout<<"$2.00";
        break;
    }
     break;
    case 0:switch(x>13)
    {
      case 1:cout<<"$8.00";
        break;
      case 0:cout<<"$4.00";
        break;
    }
      break;
  }
          
}