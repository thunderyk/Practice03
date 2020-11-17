package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,compare=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i=0;i<5;i++) {
			System.out.print("숫자: ");
			num = sc.nextInt();
			if(compare<num) {
				compare = num;
			}
		}
		System.out.println("최대값은 "+compare+"입니다.");		
		sc.close();
	}

}
