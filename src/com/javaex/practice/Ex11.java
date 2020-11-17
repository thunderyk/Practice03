package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,result=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		if(num%2==1) {
			for(int i=1;i<=num;i+=2) {
				result+=i;
			}
		}else {
			for(int i=2;i<=num;i+=2) {
				result+=i;
			}
		}
		System.out.println("결과값: "+result);
		sc.close();
	}

}
