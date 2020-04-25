#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  switch(y<x)
  {
      
      case 1: y = y+100;
      cout<<y-x;
      break;
      case 0:cout<<y-x;
      break;
  }
  
}