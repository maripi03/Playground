#include<iostream>
using namespace std;
int main()
{
  int a=3;
  int b=4;
  int x,y;
  std::cin>>x>>y;
  int hops;
  (x>y)?hops=x-a:hops=y-b;
  std::cout<<hops;
  
}