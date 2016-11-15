class MakeTriangle{
String s="*";
StringBuffer sbuf=new StringBuffer();
void makeIt(){
for(int i=0;i<11;i++){
for(int j=0;j<i;j++){
sbuf.append(s);
}
System.out.printf("%d %s\n",i,sbuf.toString());
sbuf.delete(0,sbuf.length());
}
}
public static void main(String[] args){
MakeTriangle a=new MakeTriangle();
a.makeIt();
}
}
