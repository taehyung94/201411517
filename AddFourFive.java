import java.util.*;

class AddFourFive{
	public static void main(String[] args){
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<1000;i++){
			if(i%4==0&&i%5!=0)
				l.add(i);
		}
		System.out.println(l);
		}
	}