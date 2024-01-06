import java.util.Scanner;

public class WalletExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ntc = sc.nextInt();
        while (ntc>=1) {
            int a = sc.nextInt();
            int b = sc.nextInt();
			int Alice=a;
			int Bob=b;
			boolean flag = true;
		
            
            while (flag) {
                
            
            if(Alice==0)
            {
                System.out.println("Bob");
                flag=false;
				
            }
            else if(Bob==0)
            {
                System.out.println("Alice");
                flag=false;
				
            }
            a--;
            b--;
			Alice = a^b;
        	Bob =a^b;
            Alice = a^b;
            // break;
            }
            ntc--;
        }
    }
}
