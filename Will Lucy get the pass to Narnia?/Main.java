#include<iostream>
int main()
{
  int a,b,c,d,e,f,g,h;
  std::cin>>a>>b>>c;
  std::cout<<"Enter first number : Enter second number : Menu";
  std::cout<<"\n1.Addition"<<"\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder\n";
   switch(c)
  {
    case 1:
      d=a+b;
      std::cout<<d;
      break;
     case 2:
       e=a-b;
       std::cout<<e;
       break;
     case 3:
       f=a*b;
       std::cout<<f;
       break;
     case 4:
       g=a/b;
       std::cout<<g;
       break;
     case 5:
       h=a%b;
       std::cout<<h;
       break;
     default:
       std::cout<<"Invalid operation";
   }
}