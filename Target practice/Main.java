#include<iostream>
using namespace std;
int main()
{
  int n,x;
  int sum=0,count;
  cin>>n;
  for(count=0;sum<n;count++)
  {
    cin>>x;
    sum=sum+x;
  }
  cout<<"The number of turns is "<<count;
}