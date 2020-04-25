#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  switch(z>x && z<=(x+y))
  {
    case 1:cout<<"It is a mango tree";
      break;
    case 0:switch(z>(x*(y-2)) && z<=(x*(y-1)))
    {
      case 1:cout<<"It is a mango tree";
        break;
      case 0:cout<<"It is not a mango tree";
        break;
    }
      break;
  }
}