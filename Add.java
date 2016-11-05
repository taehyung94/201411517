class Add{
int a;
int b;
int sum;
Add(int a,int b){
this.a=a;
this.b=b;
}
void calc(){
for(int n=0;n<1000;n++){
if(n%a==0||n%b==0)
sum+=n;
else if(n%(a*b)==0)
sum-=n;
}
System.out.println(sum);
}
public static void main(String[] args){
Add a=new Add(3,5);
a.calc();
}
}
