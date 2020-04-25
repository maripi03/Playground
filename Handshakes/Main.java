#include<iostream>
using namespace std;
int main()
{
  int x,y=0;
  cin>>x;
  while(x>0)
  {
    y=y+(x-1);
    x--;
  }
  cout<<y;
}