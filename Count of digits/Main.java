#include<iostream>
int main()
{
  int n,temp,count=0;
  std::cin>>n;
  temp=n;
  do
  {
    count++;
    temp=temp/10;
  }while(temp!=0);
  std::cout<<count;
  return 0;
}