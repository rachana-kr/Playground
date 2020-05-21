#include<iostream>
#include<bits/stdc++.h>
int sum_digits(int n) 
{
  if (n == 0)
    return 0;
  else if (n%9 == 0)
    return 9;
  else
    return (n%9);
}
int main() 
{
  int x;
  std::cin>>x;
  std::cout<<sum_digits(x);
  return 0;
}