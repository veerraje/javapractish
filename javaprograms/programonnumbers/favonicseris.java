package programonnumbers;

public class favonicseris {
	static	int n1=0, n2=1 , n3=0;
	static  void m2(int count){
		if(count>0){
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.println(" "+n3);
			m2(count-1);
			
			
		}
	}
public static void main(String[] args) {
int count =10;
	
	System.out.println(n1);
	System.out.println(n2);
	m2(count-2);
	
}
}
