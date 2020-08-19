/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/

public class Problem7{
	int[] primeNumbers;
	int currentNum, currentPos;

	Problem7(){
		primeNumbers = new int[10001];
		primeNumbers[0] = 2;
		currentNum=2; 
		currentPos=1;
	}

	boolean isItPrime(int num){
		for(int i=0; i<this.currentPos; i++){
			if(num%this.primeNumbers[i] == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args){
		Problem7 prob = new Problem7();

		for(int i=1; i<10001; ){
			prob.currentNum++;
			if(prob.currentNum % 2 == 0) //Skip if number is even, make things a bit faster
				continue;

			if(prob.isItPrime(prob.currentNum)){
				i++;
				prob.primeNumbers[prob.currentPos] = prob.currentNum;
				prob.currentPos++;
			}
		}

		System.out.println(prob.primeNumbers[10000]);
	}
}