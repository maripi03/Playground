#include<iostream>
using namespace std;
int main()
{
  int x;
  int count=0;
  cin>>x;
  cout<<x<<"\n";
  while(x!=1)
  {
    if(x%2==0){
      x=x/2;
      cout<<x<<"\n";
      count = count+1;
    }
    else
    {
      x=(3*x)+1;
      cout<<x<<"\n";
      count=count+1;
    }
    
  }
  cout<<count;
}