package J1;
import java.util.Scanner;
import javax.management.RuntimeErrorException;
public class J1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入密碼測試");
		int flag=0;
		int f_pass=sc.nextInt();
		System.out.print("請再輸入一次");
		int t_pass=sc.nextInt();
		for(int i=0;i<2;i++) {
			if(f_pass==t_pass) {
				flag=1;
				break;
			}
			System.out.println("與第一次輸入的不同");
			System.out.print("請再輸入一次密碼");
			t_pass=sc.nextInt();
			sc.close();
			if(flag==0) {
				throw new RuntimeErrorException(null,"輸入三次錯誤！程式停止！");
			}
			else
				System.out.println("密碼正確");
	}
		
		

	}

}
