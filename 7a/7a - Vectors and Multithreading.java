/*
7a. Write a java program to implement the vectors.
*/

import java.util.*;

class main{
	public static void main(String[] arg){
		ArrayList a = new ArrayList();
		a.add(5);
		a.add("grove street");
		a.add(0.5);
		
		Vector v = new Vector();
		v.add(2);
		
		v.addAll(1, a);
		System.out.println("Vector v: "+v);
	}
}