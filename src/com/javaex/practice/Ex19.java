package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select, cur_money=0,in,out;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			select = sc.nextInt();
			if(select==1) {
				System.out.print("예금액>");
				in=sc.nextInt();
				cur_money+=in;
			}else if(select==2) {
				System.out.print("출금액>");
				out=sc.nextInt();
				cur_money-=out;
			}else if(select==3) {
				System.out.println("잔고액>"+cur_money);
			}else if(select==4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘 못된 번호 입력");
			}
		}
		sc.close();
		
	}

}
