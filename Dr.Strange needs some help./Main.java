#include<iostream>
int bact(int m, int n)
{
  int req1=1;
  int i=1;
  while(i<=n)
  {
    req1 = req1*m;
    
    i++;
  }
return req1;
}


int main()
{
  int m=0,n,req;
  std::cin>>m>>n>>req;
  int a = bact(m,n);
  
  if(a>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
    