package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if(i*j<10) {
					System.out.print(j + "*" + i + "=" + j * i+"    ");
				}else {
					System.out.print(j + "*" + i + "=" + j * i+"   ");
				}
			}
			System.out.println("");
		}
	}
}
