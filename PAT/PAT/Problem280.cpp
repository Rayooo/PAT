//
//  Problem280.cpp
//  PAT
//
//  Created by Ray on 2017/2/7.
//  Copyright © 2017年 Ray. All rights reserved.
//

#include <iostream>
using namespace std;

int main(){
    int peach[32];
    peach[0] = 0;
    peach[1] = 1;
    for(int i=2; i<= 31; i++) {
        peach[i] = 2*(peach[i-1]+1);
    }
    int n;
    while(cin>>n) {
        if(n != 0){
            cout<<peach[n]<<"\n";
        }

    }
    return 0;
}
