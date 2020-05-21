#include<iostream>
using namespace std;
int main()
{
  int n,i,sum=0;
  std::cin>>n;
  i=n;
  while(n>0)
  {
    int r=n%10;
    sum=sum+r;
    n=n/10;
  }
  if(i%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}