package exercises;

import java.text.DecimalFormat;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbersToDisplay = {23, 6, 47, 35, 2, 14};
		
		int highest = 47;
		int num1 = 23;
		int num2 = 6;
		int num3 = 47;
		int num4 = 35;
		int num5 = 2;
		
		double averageOfNum;
		double total;
		
		System.out.println("The highest number is: " + highest);
		
		total = (num1 + num2 + num3 + num4 + num5 + highest);
		averageOfNum = total / 6;
		DecimalFormat df1 = new DecimalFormat("0.00");
		
		System.out.println("The average of the numbers are: " + (df1.format(averageOfNum)));
		
		if((num1 % 2) != 0)
		{
			
		}
	}

}
