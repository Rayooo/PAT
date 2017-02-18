//
//  main.cpp
//  PAT
//
//  Created by Ray on 2017/2/2.
//  Copyright © 2017年 Ray. All rights reserved.
//

#include <iostream>

#include <string>
#include <algorithm>
using namespace std;
int main(){
    int a,b;
    cin >> a >> b;
    
    int c = a + b;
    
    if(c <= 9999 && c >= -9999){
        cout << c;
        return 0;
    }
    
    
    string s = to_string(c);
    
    int count;
    if(c > 0){
        count = (int)s.length()/3;
        if(s.length() % 3==0){
            count --;
        }
    }
    if(c < 0){
        count = ((int)s.length()-1)/3;
        if(((int)s.length()-1) % 3==0){
            count --;
        }
    }
    reverse(s.begin(), s.end());
    string result = "";
    int i = 0;
    for(i = 0;i <= s.length();++i){
        result = s[i] + result;
        
        if( i % 3 == 2 && count > 0){
            result = "," + result;
            count --;
        }
    }
    cout << result;
    return 0;
}
