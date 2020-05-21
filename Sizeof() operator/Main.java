#include<iostream>
using namespace std;
int main()
{
 int w,x,y,z;
 w=sizeof(char);
 x=sizeof(int);
 y=sizeof(float);
 z=sizeof(double);
 std::cout<<w<<"\n"<<x<<"\n"<<y<<"\n"<<z;
}