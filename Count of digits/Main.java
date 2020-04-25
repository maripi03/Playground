#include<iostream>
int main()
{
  int x,y=0;
  std::cin>>x;
  do
  {
    y = y+1;
    x = x/10;
  }while(x>0);
std::cout<<y;
}