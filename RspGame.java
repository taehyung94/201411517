class Rsp{
private int number;
void go(){
number=(int)(Math.random()*3)+1;
}
int getNum(){
return this.number;
}
}
class Player{
private String name;
private String what;
Player(String name){
this.name=name;
}
void play(){
Rsp d=new Rsp();
d.go();
if(d.getNum.equals(1))
this.what="바위";
else if(d.getNum.equals(2))
this.what="가위";
else
this.what="보";
System.out.println(getName()+"turns on "+what);
}
String getName(){
return this.name;
}
String getWhat(){
return this.what;
}
}
class RspGame{
	String name1,name2;
	Player p1;
	Player p2;
	void startGame(){
		Player p1=new Player("th");
		Player p2=new Player("rb");
		p1.play();
		p2.play();
		if(p1.getWhat().equals("가위")&&p2.getWhat().equals("보"))
			System.out.println(p1.getName()+" won");
		else if(p1.getWhat().equals("바위")&&p2.getWhat().equals("가위"))
			System.out.println(p1.getName()+" won");
		else if(p1.getWhat().equals("보")&&p2.getWhat().equals("바위"))
			System.out.println(p1.getName()+" won");
		else if(p1.getWhat().equals(p2.getWhat()))
			System.out.println("draw");
		else
			System.out.println(p2.getName()+" won");
		
	}
	public static void main(String[] args){
		RspGame a=new RspGame();
		a.startGame();
	}
}