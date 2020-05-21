#include<iostream>
#include<bits/stdc++.h> 
int main()
{
  int x,y;
  int a=3,b=4,p,p1,p2,sq;
  std::cin>>x>>y;
  p1=pow((y-b),2);
  p2=pow((x-a),2);
  p=p1+p2;
  sq=sqrt(p);
  std::cout<<int(sq);
  return 0;
}
