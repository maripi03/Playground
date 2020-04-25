#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x;
  switch(x<=200)
  {
    case 1: y = x*0.5;
      cout<<"Rs."<<y;
      break;
    case 0: switch(x>200 && x<=400)
    {
      case 1: 
        y = x*0.65+100;
        cout<<"Rs."<<y;
        break;
      case 0: switch(x>400 && x<=600)
      {
        case 1: 
          y = x*0.80+200;
          cout<<"Rs."<<y;
          break;
        case 0: switch(x>600 && x<=800)
        {
          case 1: 
            y = x*1.25+425;
            cout<<"Rs."<<y;
            break;
        }
      }
    }
      default : cout<<"invalid input";
      break;
  }
}