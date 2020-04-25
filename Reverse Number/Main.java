#include <iostream>
int main() 
{
	int x,y=0;
  std::cin>>x;
  while(x>0)
  {
    std::cout<<x%10;
    x = x/10;
  }
	return 0;
}