#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int count;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  count = a[0];
  for(int i=1;i<n;i++)
  {
    if(a[i]>count)
    {
      count = a[i];
    }
    
  }
std::cout<<count;  
}