#include <iostream>
int main()
{
  char str[100], rev[100];     
  int count = 0, end, i;    
  std::cin.getline(str,100);
  for(i =0;str[i]!='\0';i++){
  }
  int j=0;
  for(end=i-1;end>=0;end--)
  {
    count = str[end];
    rev[j] = count;
    j++;
  }
  for(int j=0;j<i;j++)
   std::cout<<rev[j];
}