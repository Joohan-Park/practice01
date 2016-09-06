package practice01;

import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print("수를 입력하시오: ");
		int number = scanner.nextInt();
		
		if(number%3==0)
			System.out.println(number+"는 3의 배수 입니다.");
		
		scanner.close();
	}
}
