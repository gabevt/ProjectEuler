/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

public class Problem9{
	public static void main(String[] args){
		int a=1,b=1,c=1;
		boolean flag = false;
		for(; a<1000; a++){
			for(; b<1000; b++){
				for(; c<1000; c++){
					/*A couple of skips to make it "faster"*/
					if(b>c){
						c=b;
						continue;
					}

					if(a>b){
						b=a;
						continue;
					}

					if((a+b+c) == 1000){
						if((a*a + b*b) == (c*c)){
							flag = true;
							break;
						}
					}
				}

				if(flag)
					break;
				c=1;
			}

			if(flag)
				break;
			b=1;
		}

		System.out.println("a=" + a + " b=" + b + " c=" + c + " abc=" + a*b*c);
	}
}