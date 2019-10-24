package com.xiaoxiaofengsi.fengfeng_management.controller;

import java.util.Scanner;

public class fengfenga {
    public static void main(String args[]){
//        System.out.println("九九乘法表出来吧");
//        for (int i=1;i<=9;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j + "*"+i +"=" + i*j +" ");
//            }
//            System.out.println();
//        }
        Scanner in = new Scanner(System.in);
        int aa = in.nextInt();
//        for(int i=1;i<=aa;i++){
//            System.out.print(i+" ");
//        }
//        for(int i=aa-1;i>=1;i--){
//            System.out.print(i+" ");
//        }
        for (int i=1;i<=aa;i++){
            for (int j=1;j<=2*aa-1;j++){
                if(j>=aa-i+1 &&j<=aa+i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
