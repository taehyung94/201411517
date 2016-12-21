import java.util.*;

class CountString{
	public static void main(String[] args){
		Map<String,Integer> a=new HashMap<String,Integer>();
		char[] letters="vacation".toCharArray();
		String s;
		for(char c:letters){
			s=Character.toString(c);
			if(a.containsKey(s))
				a.put(s,a.get(s)+1);
			else
				a.put(s,1);
		}
		System.out.println(a);
	}
}