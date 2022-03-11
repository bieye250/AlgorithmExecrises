#include <iostream>
#include <vector>
int main(){
    std::cout<<"hello world"<<std::endl;

    std::vector<int> v{1,2,3};
    int a = 8;
    for(auto &p : v)
        std::cout<<p;
}