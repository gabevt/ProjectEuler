/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/

public class Problem10{
	
	//Don't do this, I was lazy and there's better and quicker ways to do this
	static boolean isItPrime(long num){
		for(long i=2; i<num; i++){
			if(num%i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args){
		long acum = 2;
		for(long i=3; i<2000000; i++){
			if(isItPrime(i)){
				acum += i;
				//System.out.println(i);
			}
		}

		System.out.println(acum);
	}
}