package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			result=result+i;
		}
		System.out.println("합계: "+result);
		sc.close();
	}

}
