package demopush;
import java.util.*;
public class Exprbm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the string:");
		String str=sc.next();
		String[] a=str.split(",");
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp1=Integer.parseInt(a[i]),sum1=0;
				int temp2=Integer.parseInt(a[j]),sum2=0;
				while(temp1!=0) {
					sum1=sum1+temp1%10;
					temp1=temp1/10;
				}
				while(temp2!=0) {
					sum2=sum2+temp2%10;
					temp2=temp2/10;
				}
				if(sum1==sum2)
					count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
