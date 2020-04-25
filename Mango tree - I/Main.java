#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  switch(z<=y)
  {
    case 1: cout<<"Yes";
      break;
    case 0:switch(z%y==0)
    {
      case 1:cout<<"Yes";
        break;
      case 0:switch((z-1)%y==0)
      {
        case 1:cout<<"Yes";
        break;
        case 0:cout<<"No";
          break;
      }
        break;
    }
      break;
  }
    
}