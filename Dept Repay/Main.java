#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float total,rate;
  std::cin>>p>>r>>t;
  float z = p*r*t/100;
  total = float(z+p);
  float x = float(z*2/100);
  float y = total-x;
  std::cout<<z<<"\n"<<total<<"\n"<<x<<"\n"<<y;
  
}