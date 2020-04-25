#include<iostream>
using namespace std;
int main()
{
  int x1,x2,x3,y1,y2,y3;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float z1,z2;
  z1 = (float)(x1+x2+x3)/3;
  z2 = (float)(y1+y2+y3)/3;
  std::cout<<z1<<"\n"<<z2;
}