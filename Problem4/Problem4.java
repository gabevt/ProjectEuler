/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/

public class Problem4{
	public static void main(String[] args){
		int num=0, iAux=0;
		String sAux="0";

		for(int i=100; i<1000; i++){
			for(int j=100; j<1000; j++){
				iAux = i*j;
				sAux = Integer.toString(iAux);
				if(sAux.equals(new StringBuffer(sAux).reverse().toString())){
					num = iAux>num ? iAux : num;
				}
			}
		}

		System.out.println(num);
	}
}