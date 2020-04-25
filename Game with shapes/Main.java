#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  switch((x*2)<=y)
  {
    case 1:cout<<"circle can be inside a square";
      break;
    case 0:cout<<"circle cannot be inside a square";
      break;
  }
}