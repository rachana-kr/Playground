#include<iostream>
  int main()
  {
   int sum=0,p,i;
    int initial,final;
    std::cin>>initial>>final;
    for(i= initial; i<= final; i++)
    {
      p=1;
      while(p<=(i/2))
      {
        if(i % p == 0)
          sum=sum+p;
        p++;
      }
      if(sum==i)
        std::cout<<i<<" ";
      sum=0;
    }
    return 0;
  }
 