qpackage com.sd.yut;

public class Dice{
private Integer number;
void roll(){
number=(int)(Math.random()*6)+1;
}
int getNum(){
return this.number;
}
}