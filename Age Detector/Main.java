#include<iostream>
using namespace std;
int main()
{
 int b,c,a;
  std::cin>>b>>c;
  if(c<b)
  {
    b=100-b;
    a=b+c;
    std::cout<<a;
  }
  else
  {
    a=c-b;
    std::cout<<a;
  }
}