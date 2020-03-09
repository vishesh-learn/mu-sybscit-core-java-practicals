import java.util.Scanner;

class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer: ");
		
		int n = sc.nextInt();
		
		int i;
		for(i=1;i<=10;i++){
			System.out.println(n*i);
		}
	}
}