class ChangeFC{
String a;
double b;
ChangeFC(String a,double b){
this.a=a;
this.b=b;
}
void change(){
if(a=="F")
System.out.printf("%.1f",(b-32)/1.8);
else if(a=="C")
System.out.printf("%.1f",b*1.8+32);
}
public static void main(String[] args){
ChangeFC a=new ChangeFC("F",100);
a.change();
}
}
