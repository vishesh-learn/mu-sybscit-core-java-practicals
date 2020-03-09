class BinaryConverter{
	public static void main(String[] args){
		int d = 13, b = 1101, rem, bin = 0, bits = 0;
		converter c = new converter();
		
		System.out.println("dec: " + d + "\nto bin: " + c.DecToBin(d) + "\n\nbin: " + b + "\nto dec: " + c.BintoDec(b));
	}
}

class converter{
	public static long DecToBin(int n){
		long bin = 0;
		int i = 1, rem;
		
		while(n!=0){
			rem = n % 2;
			n /= 2;
			bin += rem * i;
			i *= 10;
		}
		
		return bin;
	}
	
	public static int BintoDec(int n){
		int rem, dec = 0, i = 0;
	
		while(n!=0){
			rem = n % 10;
			n /= 10;
			dec += rem * Math.pow(2,i);
			++i;
		}
		
		return dec;
	}
}