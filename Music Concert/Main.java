#include<iostream>
int main(){
  int *a;
  int n,male=0,female=0;
  std::cin>>n;
  a = (int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    std::cin>>*(a+i);
  }
  for(int i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
      female++;
    else
      male++;
  }
  std::cout<<male<<"\n";
  std::cout<<female<<"\n";
  free(a);
  a=NULL;
  return 0;
}