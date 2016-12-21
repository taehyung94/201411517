class Hello{
	private String name;
	Hello(String name){
		this.name=name;
	}
	public void sayHello(){
		System.out.println(name+" hello");
	}
}

class GoHello{
	static Hello[] h=new Hello[3];
	public static void main(String[] args){
		h[0]=new Hello("th1");
		h[1]=new Hello("th2");
		h[2]=new Hello("th3");
		for(int i=0;i<3;i++)
			h[i].sayHello();
	}
}
