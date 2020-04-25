#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  int w = (y*75)+(z*30);
  switch(x>w)
  {
    case 1: cout<<"Boat is stable";
      break;
    case 0: cout<<"Boat will drow";
      break;
  }

  
}