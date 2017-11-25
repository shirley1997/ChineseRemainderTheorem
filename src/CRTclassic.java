import java.util.Scanner;
public class CRTclassic {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		int s;
		int k,count = 1;
		//int k;
		int a,b,c;
		
		/*if((3*5*k)%7 != 1) {
			k++;
		}*/
		for(k=1;(3*5*k)%7 != 1;k++);
		a = 3*5*k;
		
		/*if((3*7*k)%5 != 1) {
			k++;
		}*/
		for(k=1;(3*7*k)%5 != 1;k++);
		b = 3*7*k;
		
		/*if((5*7*k)%3 != 1) {
			k++;
		}*/
		for(k=1;(5*7*k)%3 != 1;k++);
		c = 5*7*k;
		while(sc.hasNext()) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			n3 = sc.nextInt();
			
			if(n1 == -1 && n2==-1 && n3==-1)
				break;
			
			s = (a*n3 + b*n2 + c*n1)%(3*5*7);
			System.out.println("Case "+count+": s equals "+s);
			count++;
		}
		
		
		
	}
}
