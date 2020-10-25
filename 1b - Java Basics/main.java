/*
1b. Write a Java program to display the following pattern.
*****
****
***
**
*
 */

class main{
	public static void main(String args[]){
		int i, j;
		String star = "";
		
		for(j=5;j>0;j--){
			
			for(i=1;i<=j;i++){
				star += "*";
			}
			
			System.out.println(star);
			
			star = "";
		}
	}
}