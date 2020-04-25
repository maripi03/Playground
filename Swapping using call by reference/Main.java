#include<iostream>
void gun(int &a, int &b)
{
  
  int temp = a;
  a = b;
  b = temp;
  
}
int main()
{
  int x,y;
  std::cin>>x>>y;
  std::cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
  gun(x, y);
  std::cout<<"After swapping a= "<<x<<" and b="<<y;
}
  
  