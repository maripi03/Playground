#include<iostream>
using namespace std;
int main()
{
  int su=1,m=1,tu=1,w=1,th=1,f=1,sa=1;
  int y = su+m+tu+w+th+f+sa;
  int sup,sap;
  int su1,m1,tu1,w1,th1,f1,sa1;
  cin>>su>>m>>tu>>w>>th>>f>>sa;
  
  int total = m+tu+w+th+f;
  int total1;
   if(m>8 && m<=24)
    m1 = (m-8)*15;
    else
    m1 =0;
  if(tu>8 && tu<=24)
    tu1 = (tu-8)*15;
    else
    tu1 =0;
  if(w>8 && w<=24)
    w1 = (w-8)*15;
    else
    w1 =0;
  if(th>8 && th<=24)
    th1 = (th-8)*15;
    else
    th1 =0;
  if(su>8 && su<=24)
    su1 = (su-8)*15;
    else
    su1 =0;
  if(sa>8 && sa<=24)
    sa1 = (sa-8)*15;
    else
    sa1 =0;
  if(f>8 && f<=24)
    f1 = (f-8)*15;
    else
    f1 =0;
  
    
total1 = (su1+sa1+m1+tu1+w1+th1+f1);
 sup=su*150;
  sap=sa*125;
  
  switch(total<=168)
  {
    case 1:switch(total>=40 && y<=7)
  {
    case 1:cout<<total*100+((total-40)*25)+total1+sap+sup;
      break;
    case 0:cout<<total*100+total1+sap+sup;
      break;
  }
      break;
    case 0:"Not valid input";
      break;
}
}