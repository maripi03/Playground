#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,dtotal,ctotal,a,b;
  cin>>d1>>c1>>d2>>c2;
  ctotal=c1+c2;
  b=ctotal;
  if(ctotal>=100)
    a=ctotal/100;
  dtotal=d1+d2+a;
  cout<<dtotal<<"\n";
  while(ctotal>=100)
  {
    ctotal=b-100;
  }
  cout<<ctotal;
    
  
}