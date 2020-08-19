/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/

public class Problem5{
	public static void main(String[] args){
		int number=20;//Has to be at minimum this one
		boolean flag = true;
		while(flag){
			number++;
			for(int i=1; i<21; i++){
				if(number%i != 0){
					break;
				}

				flag = i==20 ? false : true;
			}

			if(!flag){
				break;
			}
		}

		System.out.println(number);
	}
}