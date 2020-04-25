#include<iostream>
int main()
{
  int n,count=0,c;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>count;
  
  for(int i = 0;i<n;i++)
  {
    if(a[i]==count)
    {
      c = i;
      std::cout<<"She passed her exam";
      break;
    }
    
  }
  if(a[c]!=count)
    std::cout<<"She failed";
 
      
}