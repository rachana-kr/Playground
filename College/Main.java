struct College
{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};
#include<iostream>
int main()
{
  struct College
  {
    char name[100];
    char city[100];
    int establishmentYear;
    float passPercentage;
  };
  int n,i,j;
  std::cin>>n;
  std::cout<<"Enter the number of colleges \n";
  struct College stud[n];
  j=1;
  for(i=0;i<n;i++)
  {
    std::cout<<"Enter the details of college "<<j<<"\n";
    std::cout<<"Enter name \n";
    std::cin>>stud[i].name;
    std::cout<<"Enter city \n";
    std::cin>>stud[i].city;
    std::cout<<"Enter year of establishment \n";
    std::cin>>stud[i].establishmentYear;
    std::cout<<"Enter pass percentage \n";
    std::cin>>stud[i].passPercentage;
    j++;
  }
  j=1;
  std::cout<<"Details of colleges \n";
  for(i=0;i<n;i++)
  {
    std::cout<<"College:"<<j<<"\n";
    std::cout<<"Name:"<<stud[i].name<<"\n";
    std::cout<<"City:"<<stud[i].city<<"\n";
    std::cout<<"Year of establishment:"<<stud[i].establishmentYear<<"\n";
    std::cout<<"Pass percentage:"<<stud[i].passPercentage<<"\n";
    j++;
  }
  return 0;
}

