package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, five_div = 0, five_sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				++five_div;
				five_sum += i;
			}
		}
		System.out.println("5의 배수의 개수: " + five_div);
		System.out.println("5의 배수의 합: " + five_sum);
		
		sc.close();
	}

}
