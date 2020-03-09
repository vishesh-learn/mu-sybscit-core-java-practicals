class main{
	public static void main(String[] arg){
		String str = "A sample string containing letters, spaces, numbers like 1, 2, 3 and other characters like @, #, %.";
		
		char c;
		
		int letterC = 0, spaceC = 0, numberC = 0, otherC = 0, l = str.length(), i;
		
		for(i=0; i<l; i++){
			c = str.charAt(i);
			
			if(Character.isLetter(c))
				letterC ++;
			else if(Character.isDigit(c))
				numberC ++;
			else if(Character.isSpaceChar(c))
				spaceC ++;
			else
				otherC ++;
		}
		
		System.out.println("String: "+str+"\n\nletters: "+letterC+"\nnumbers: "+numberC+"\nspaces: "+spaceC+"\nother: "+otherC);
	}
}