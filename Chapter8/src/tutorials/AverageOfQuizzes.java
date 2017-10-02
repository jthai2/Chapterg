package tutorials;

import java.util.Scanner;

public class AverageOfQuizzes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = new int [10];
		
		int score = 0;
		int count = 0;
		int total = 0;
		
		int quit = 999;
		int max = 10;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quiz score or " + quit + " to quit >>");
		score = input.nextInt();
		
		while(score != quit)
		{
			scores[count] = score;
			total = total + scores[count];
			++count;
			if(count == max)
				score = quit;
			else 
				System.out.println("Enter next quiz score or " + quit + " to quit >>");
				score = input.nextInt();
		}
		System.out.print("The scores entered were: ");
		for(int x = 0; x < count; ++x)
			System.out.println(scores[x] + " ");
	}

}
