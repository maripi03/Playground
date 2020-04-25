#include<iostream>
using namespace std;
int main()
{
  int x,y=0,z=1,sum=0;
  int a=1;
  cin>>x;
  while(a<=(x-2))
  {
    sum=y+z;
    y=z;
    z=sum;
    a++;
    
  }
  cout<<sum;
  
    
}