#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  if((r+c==n) || ((r+c)*2==n))
    std::cout<<"It is a mango tree";
  else 
    std::cout<<"It is not a mango tree";
}