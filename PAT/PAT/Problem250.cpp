//
//  Problem250.cpp
//  PAT
//
//  Created by Ray on 2017/2/7.
//  Copyright © 2017年 Ray. All rights reserved.
//https://www.nowcoder.com/pat/2/problem/250

#include <stdio.h>
int main(){
    int arr[1000001];
    arr[0] = 7;
    arr[1] = 11;
    for(int i = 2;i < 1000001;++i){
        arr[i] = arr[i-1] + arr[i-2];
    }
    int a;
    
    while (scanf("%d",&a) != EOF) {
        if(a % 4 == 2){
            printf("Yes\n");
        }
        else{
            printf("No\n");
        }
    }
    
    return 0;
}
