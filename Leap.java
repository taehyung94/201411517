class Leap{
	int a;
	Leap(int a){
		this.a=a;
	}
	void getLeap(){
		if((a%4==0&&a%100!=0)||(a%400==0))
			System.out.println(a+" is a leap year.");
		else
			System.out.println(a+" is not a leap year.");
	}
	public static void main(String[] args){
		Leap a=new Leap(2016);
		a.getLeap();
	}
}