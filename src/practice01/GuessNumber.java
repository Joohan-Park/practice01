package practice01;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();


		int max = 100;
		int min = 1;
		int count = 1;

		System.out.println("수를결정하였습니다. 맞추어보세요");
		while (true) {
			int k = r.nextInt(100) + 1;
			while (true) {
				System.out.println(min + "-" + max);

				System.out.print(count + ">>");

				int corretAnswer = scanner.nextInt();

				if (corretAnswer == k) {
					System.out.println("맞았습니다.");
					break;
				} else if (corretAnswer < k) {
					min = corretAnswer;
					System.out.println("더높게");
					count++;
				} else if (corretAnswer > k) {
					max = corretAnswer;
					System.out.println("더낮게");
					count++;
				}
			}
			max=100;
			min=1;
			count=1;
			System.out.print("다시하시겠습니까(y/n)>>");
			String answer = scanner.next();
			if(answer.equals("n")){
				break;
			}
			
		}
		System.out.println("게임이종료되었습니다.");
	scanner.close();
	scanner.close();	
	}
}
