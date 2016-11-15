class Grade{
double score;
Grade(double score){
this.score=score;
}
void getGrade(){
if(90<=score&&score<=100)
System.out.println("grade is A");
else if(80<=score&&score<90)
System.out.println("grade is B");
else if(70<=score&&score<80)
System.out.println("grade is C");
else if(60<=score&&score<70)
System.out.println("grade is D");
else
System.out.println("grade is F");
}
public static void main(String[] args){
Grade a=new Grade(100);
a.getGrade();
}
}
