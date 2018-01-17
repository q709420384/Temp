#include <iostream>  
#include <algorithm>  
#include <array>  
#include <vector>  
#include <functional>  
  
using namespace std;  
  
int main()
{  
      
    array<int,8> test = {3,5,7,11,13,17,19,23};  
    array<int,8> t2; 
    //copy(test.begin(),test.end(),t2.begin());

    //只拷贝小于15的数
    //copy_if(test.begin(),test.end(),t2.begin(),bind2nd(less<int>(),15)); 
    //只拷贝test前n个数
    copy_n(test.begin(),5,t2.begin());  
  
    for_each(t2.begin(),t2.end(),[](int i){cout<<i<<endl;});  
  
    return 0;  
}  
