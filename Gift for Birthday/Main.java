#include<iostream>
using namespace std;
int main()
{
  int a;
  std::cin>>a;
  if((a%4==0) && (a%100!=0))
    std::cout<<a<<" is a leap year";
  else 
    std::cout<<a<<" is not a leap year";
}