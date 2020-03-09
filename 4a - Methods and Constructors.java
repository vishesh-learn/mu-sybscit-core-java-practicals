class main{
	public static void main(String[] arg){
		int arr[] = {5, 7, 8, 1, 0}, asec, desc, i;
		
		SortData sd = new SortData();
		
		System.out.println("Original: ");
		for(i=0; i<5; i++)
			System.out.print(arr[i]+"\t");
		
		sd.asec(arr);
		
		System.out.println("\n\nAscending: ");
		for(i=0; i<5; i++)
			System.out.print(arr[i]+"\t");
		
		sd.desc(arr);
		
		System.out.println("\n\nDescending: ");
		for(i=0; i<5; i++)
			System.out.print(arr[i]+"\t");
	}
}

class SortData{
	public static void asec(int a[]){
		int i, j, temp;
		
		for(i=0; i<4; i++){
			for(j=i+1; j<5; j++){
				if(a[j] < a[i]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	
	public static void desc(int a[]){
		int i, j, temp;
		
		for(i=0; i<4; i++){
			for(j=i+1; j<5; j++){
				if(a[j] > a[i]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
}