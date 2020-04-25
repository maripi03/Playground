#include<iostream>
struct com{
  int f;
  int i;
}p1,p2,sum,sub,mul;
int main()
{
  int choice;
  std::cin>>choice;
  std::cin>>p1.f;
  std::cin>>p1.i;
  std::cin>>p2.f;
  std::cin>>p2.i;
  sum.f = p1.f+p2.f;
  sum.i = p1.i+p2.i;
  sub.f = p1.f-p2.f;
  sub.i = p1.i-p2.i;
  mul.f = (p1.f*p2.f)+((p1.i*p2.i)*-1);
  mul.i = (p1.f*p2.i)+(p1.i*p2.i);
  switch(choice)
  {
    case 1:
      if(sum.i>=0)
        std::cout<<sum.f<<"+"<<sum.i<<"i";
      else
        std::cout<<sum.f<<sum.i<<"i";
      break;
    case 2:
      if(sub.i>=0)
        std::cout<<sub.f<<"+"<<sub.i<<"i";
      else
        std::cout<<sub.f<<sub.i<<"i";
      break;
    case 3:
      if(mul.i>=0)
        std::cout<<mul.f<<"+"<<mul.i<<"i";
      else
        std::cout<<mul.f<<mul.i<<"i";
      break;
    default:
      std::cout<<"Invalid choice";
      break;
  }  
}
  
  
