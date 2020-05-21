#include<iostream>
using namespace std;
int main()
{
  float m;
  int l,d;
  cin>>m>>l>>d;
  float x = m*l;
  if(x < d)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}

