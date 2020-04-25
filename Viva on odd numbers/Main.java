#include<iostream>
using namespace std;
int main()
{
  int x;
  int turns=0;
  float count=0;
  do
  {
    cin>>x;
    if(x<0)
      count=count-1.0;
    else if((x%2)!=0)
    {
      count=count+1.0;
      turns++;
    }
    else
      count=count-0.5;
  }while(x>0 && turns!=3);
  cout<<count;
}