import java.util.Scanner ; 


public class BasicCalculator {
	public static void main(String[] args) {
		double n1,n2,cal,a;
		System.out.println("enter two number");
		Scanner sc = new Scanner ( System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("enter your operation");
		a = sc.nextInt();
		sc.close();
		
		if (a==1){
			cal = n1 + n2;
		System.out.println("add" + cal);
		
		
		}else if (a == 2){
			cal = n1 - n2;
			System.out.println("sub" +cal);
			
		}else if (a==3) {
			cal = n1 *n2;
			System.out.println("mul" + cal);
			
		}else if ( a==4) {
		cal = n1/n2;
		System.out.println("divide" + cal);
		
		
		
		
		}
		System.out.println("******   *****   *****            *   *   *     *   ******");
		System.out.println("*          *       *              *   *   *     *   *    *");
		System.out.println("******     *       *              *****   *     *   ******");
		System.out.println("     *     *       *              *   *   *     *   *    *");
		System.out.println("     *    ****     *              *   *   ******    ******");
		
		
		
		
		
		
		
	}
}
	
		
		  