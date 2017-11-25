import java.util.Scanner;
public class CR{
	
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int p,e,i,d;
	int k,days,count = 1;
	int a,b,c;
	int s;
	
		for(k=1; (23*28*k)%33 != 1;k++);
		a = 23*28*k;
		for(k=1; (23*33*k)%28 != 1;k++);
		b = 23*33*k;
		for(k=1; (28*33*k)%23 != 1;k++);
		c = 28*33*k;
		
		while(scanner.hasNext()) {
			p = scanner.nextInt();
			e = scanner.nextInt();
			i = scanner.nextInt();
			d = scanner.nextInt();
		
		
		
		if(p==-1 && e==-1 && i==-1 && d==-1)
		
			break;
		
		
		s = (a*i+b*e+c*p)% 21252;
		days = s - d;
		if(days <= 0)
			days = days + 21252;
		System.out.println("Case "+count+" the next triple peak occurs in "+days+ " days");
		count++;
		//scanner.close();
		
		
		
		}
	}

	
	
	
}