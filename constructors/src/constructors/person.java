package constructors;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class person {
	
	private String name;
	private int age;
	
	person(String s,int i){
		name = s;
		age = i;
	}
public void check(){
	if(age <= 30)
		System.out.println("He is young age");
	else if (age<=50)
		System.out.println("He is middle age");
	else
		System.out.println("He is old age");
}
}	
class demo{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String s = args[0];
		int i = Integer.parseInt(args[1]);
		person p = new person(s,i);
		p.check();
	}	
}

