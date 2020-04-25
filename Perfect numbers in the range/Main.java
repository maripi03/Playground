#include<iostream>
int main()
{
  int x,y;
  int a,sum;
  std::cin>>x>>y;
  while(x<y)
  {
      sum=0;
      a=1;
    while(a<x)
    {
     if(x%a==0){
     sum=sum+a;}
     a++;}
     if(sum==x){
         std::cout<<x<<" ";}
     x++; 
     }
}