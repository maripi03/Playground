#include<iostream>
int main()
{
  int r,c;
  std::cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  for(int j=0;j<c;j++){
    for(int i=0;i<r;i++){
      for(int b=j;b<j+1;b++){
        std::cout<<a[i][b]<<" ";
      }
    }
    std::cout<<"\n";
  }
  
}