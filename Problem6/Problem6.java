/*The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/

public class Problem6{
	public static void main(String[] args){
		int sum1 = 0, sum2 = 0;
		for(int i=1; i<101; i++){
			sum1 += i*i;
			sum2 += i;
		}

		sum2 *= sum2;

		System.out.println(sum2-sum1);

	}
}