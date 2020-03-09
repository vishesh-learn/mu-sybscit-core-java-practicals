class main{
	public static void main(String[] arg){
		int c[] = {5, 7, 8, 4}, smallest = c[0], largest = c[0], i;
		
		System.out.println("Array: ");
		for(i=0; i<4; i++){
			System.out.println(c[i]);
			
			if(c[i] < smallest)
			smallest = c[i];
			
			if(c[i] > largest)
				largest = c[i];
		}
		
		System.out.println("\nsmallest: "+smallest+"\nlargest: "+largest);
	}
}