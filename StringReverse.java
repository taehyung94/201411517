import java.util.*;
class StringReverse{
	public static void main(String[] args){
		String hello="hello";
		StringBuilder olleh=new StringBuilder();
		char[] r=hello.toCharArray();
		for(int i=r.length-1;i>=0;i--)
			olleh.append(r[i]);
		System.out.println(olleh);
	}
}