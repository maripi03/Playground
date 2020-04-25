#include<iostream>
int main()
{
  int x,y,z;
  int a = 1,sum=0;
  std::cin>>x>>y;
  z=x+y;
  while(a<z)
  {
    if(z%a==0)
      sum=sum+a;
    a++;
  }
  
  if(sum==z)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
    
}