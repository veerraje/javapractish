package programonnumbers;

public class factorialnum {
	
	static int m1(int n){
		
		
		if(n==1){
			return 1;
		}
		else {
		return	(n*m1(n-1));
		}
			
		
		}
		public static void main(String[] args) {
			System.out.println("factorial  = "+m1(4));
			

		}
}

