#include<iostream>
using namespace std;
int main()
{
  int x,y,z,sum=1;
  int count=0,a=1;
  cin>>x;
  y = x*x;
  while(y>0)
  {
    y=y/10;
    count++;
  }
  z=count/2;
  while(a<=z)
  {
    sum=sum*10;
    a++;
  }
  
  y=x*x;
  int total=(y/sum)+(y%sum);
  if(x==total)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  
      
}