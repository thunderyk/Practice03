package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			for(int j=i;j<10+i;j++) {
				if(j>=10) {
					System.out.print(j+"  ");
				}else {
					System.out.print(j+"   ");
				}
				
			}
			System.out.println();
		}
	}

}
