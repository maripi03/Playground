#include<iostream>
int main()
{
  int x,y,menu;
  std::cin>>x>>y>>menu;
  std::cout<<"Enter first number :"<<" Enter second number :"<<" Menu";
  std::cout<<"\n1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";
  switch(menu)
  {
    case 1:
      std::cout<<"\n"<<x+y;
      break;
    case 2:
      std::cout<<"\n"<<x-y;
      break;
    case 3:
      std::cout<<"\n"<<x*y;
      break;
    case 4:
      std::cout<<"\n"<<x/y;
      break;
    case 5:
      std::cout<<"\n"<<x%y;
      break;
    default:
      std::cout<<"\nInvalid operation";
      break;
  }
}