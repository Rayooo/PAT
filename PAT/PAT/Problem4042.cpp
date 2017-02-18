//
//  Problem4042.cpp
//  PAT
//
//  Created by Ray on 2017/2/6.
//  Copyright © 2017年 Ray. All rights reserved.
// https://www.nowcoder.com/pat/6/problem/4042

#include <iostream>
using namespace std;
int main(){
    int a,b,c,d;
    cin >> a >> b >> c >> d;
    
    int count1 = 0,count2 = 0;
    while (a > 0) {
        if(a % 10 == b){
            count1 ++;
        }
        a /= 10;
    }
    
    while (c > 0) {
        if(c % 10 == d){
            count2 ++;
        }
        c /= 10;
    }
    
    int ans1 = 0, ans2 = 0;
    while (count1 --) {
        ans1 = ans1*10 + b;
    }
    while (count2 --) {
        ans2 = ans2*10 + d;
    }
    
    cout<<ans1+ans2;
    
    return 0;
}
