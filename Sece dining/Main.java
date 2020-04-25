#include<iostream>
using namespace std;
int main()
{
  char abc[10];
  int boom;
  cin>>abc>>boom;
  switch(boom==1)
  {
    case 1:switch(abc[0])
  {
    case 'r':cout<<"Right Handed";
      break;
    case 'f':cout<<"Left Handed";
      break;
  }
      break;
    case 0:switch(abc[0])
  {
    case 'r':cout<<"Left Handed";
      break;
    case 'f':cout<<"Right Handed";
      break;
  }
      break;
  }
}