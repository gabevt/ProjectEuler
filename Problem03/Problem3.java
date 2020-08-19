/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/

public class Problem3{
	static boolean checkPrime(long n){
		boolean value = true;

		for(long i=n-1L; i>1L; i--){
			if(n%i==0L){
				value = false;
				break;
			}
		}

		return value;
	}

	public static void main(String[] args){
		long number = 600851475143L;
		//long prime = 0L;
		long i;
		
		for(i=2L; i < number; i++){
			//System.out.println(i);
			if(checkPrime(i)){
				if(number%i == 0){
					System.out.println("Next Prime: " + i);
					number /= i;
				}
			}
		}

		System.out.println("Last Prime: " + number);
	}
}