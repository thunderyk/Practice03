package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,result=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		for(int i=num;i>1;i--) {
			result*=i;
		}
		
		System.out.println("결과값: "+result);
		sc.close();
	}

}
