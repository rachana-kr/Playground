#include<iostream>
int power(int n1, int n2);
int main() {
    int base, a, result;
    std::cin>>base;
    std::cout<<"Enter the value of a\n";
    std::cin>>a;
    std::cout<<"Enter the value of n\n";
    result = power(base, a);
    std::cout<<"The value of "<<base<<" power "<<a<<" is "<<result;
    return 0;
}

int power(int base, int a) {
    if (a != 0)
        return (base * power(base, a - 1));
    else
        return 1;
}