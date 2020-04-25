#include<iostream>
int main()
{
    /* variable definition and initialization */   
    int n, i, c = 0;
    
    /* Get user input */     std::cin>>n;
    
    /*logic*/    for (i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
           c++;
        }
    }
    if (c == 2)
    {
       std::cout << "Eligible";
    }
    else
    {
         std::cout << "Not eligible"; 
    }
    return 0;    
}