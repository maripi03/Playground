#include <cstring>
#include <iostream>
int main()
{
   char str[100];
  int count=1;
  std::cin.getline(str,100);
  for(int i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
      count++;
  }
  //std::cout<<count;
  if(count<=10)
    std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
  
  
   
   
}