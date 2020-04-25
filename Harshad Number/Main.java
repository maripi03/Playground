#include<iostream>
using namespace std;
int main()
{
  int x,sum=0;
  cin>>x;
  int y=x;
  while(x>0)
  {
    sum=sum+x%10;
    x=x/10;
  }
  switch(y%sum==0)
  {
    case 1:cout<<"Harshad Number";
      break;
    case 0:cout<<"Not Harshad Number";
      break;
  }
    
}