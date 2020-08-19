/*
The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
*/

public class Problem12{
	int currentTriangleNum;
	int currentIndex;

	public Problem12(){
		currentTriangleNum = 0;
		currentIndex = 0;
	}

	void generateNextTriangleNumber(){
		this.currentTriangleNum += currentIndex;
		this.currentIndex++;
	}

	/*
	If we look carefully, all the divisors are present in pairs. For example if n = 100, then the various pairs of divisors are: (1,100), (2,50), (4,25), (5,20), (10,10)
	*/
	int checkDivisors(){
		int divisors = 0;
		for(int i=1; i<=Math.sqrt(this.currentTriangleNum); i++){
			if(this.currentTriangleNum%i == 0){
				if(this.currentTriangleNum/i == i)
					divisors++;
				else
					divisors += 2;
			}
		}
		return divisors;
	}

	public static void main(String[] args){
		Problem12 x = new Problem12();
		boolean flag = true;
		do{
			x.generateNextTriangleNumber();
			if(x.checkDivisors() > 500)
				flag = false;
		}while(flag);

		System.out.println(x.currentTriangleNum);
	}
}