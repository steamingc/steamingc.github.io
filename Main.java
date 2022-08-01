package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tx = 0;	//x좌표 총합
		int ty = 0;	//y좌표 총합

		for(int i=0; i<3; i++) {
			int x = sc.nextInt();
			tx += x;
			int y = sc.nextInt();
			ty += y;
		}
		sc.close();

		System.out.printf("(%.1f, %.1f)", tx/3.0, ty/3.0);
	}
}
