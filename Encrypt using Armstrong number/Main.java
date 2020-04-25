#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  	int count = 0;
  	int f =n;
    while(n!=0)
    {
      n = n/10;
      count++;
    }
  int sum=0,rem;
  while(f!=0)
  {
    rem = f%10;
    sum = sum+power(rem, count);
    f = f/10;
  }
  
  return sum;  
}
int main()
{
    int n;
    std::cin>>n;
  	
  	if(arm(n)==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
  	
  
  	
    
    
}