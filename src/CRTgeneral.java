import java.util.Scanner;
public class CRTgeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please in order (dividend+remainder) type dividends and their remainders: ");
		Scanner exam = new Scanner(System.in);
		
		int i1,j1,w1; //remainder from i,j,w;
		int i=1,j=1,w=1; //dividend;
		int a,b,c;//common multiple
		int k,count = 1;//use to find common multiple and count Case number;
		int s; //result
		
		
		
		while(exam.hasNext())/*if there exists token then it returns true*/ {
			i = exam.nextInt();
			i1 = exam.nextInt();
			j = exam.nextInt();
			j1 = exam.nextInt();
			w = exam.nextInt();
			w1 = exam.nextInt();
			
			for(k=1;(i*j*k)%w != 1;k++);
			a = i*j*k;
			for(k=1;(i*w*k)%j != 1;k++);
			b = i*w*k;
			for(k=1;(j*w*k)%i != 1;k++);
			c = j*w*k;
			
			if(i==-1 && j==-1 && w==-1 && i1==-1 && j1==-1 && w1==-1)
				break;
			
			s = (a*w1+b*j1+c*i1)%(i*j*w);
			System.out.println("Case "+count+": s equals "+s);
			count++;
		}
		
	}

}
