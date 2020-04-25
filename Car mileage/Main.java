#include<iostream>
using namespace std;
int main()
{
  float x;
  int y,z;
  cin>>x>>y>>z;
  switch(z<=x*y)
  {
    case 1:cout<<"Can reach";
      break;
    case 0:cout<<"Cannot reach";
      break;
  }
}