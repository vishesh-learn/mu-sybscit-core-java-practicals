class main{
	public static void main(String[] arg){
		char c[] = {'5', '7', '8', '4'};
		long sum = 0;
		int i;
		
		System.out.println("Character array: ");
		for(i=0; i<4; i++){
			sum += Character.getNumericValue(c[i]);
			System.out.println(c[i]);
		}
		
		System.out.println("\nsum: "+sum); 
	}
}