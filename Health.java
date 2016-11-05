class Health{
private double bmi;
private double weight;
private double height;
Health(double weight,double height){
this.weight=weight;
this.height=height;
}
void getBMI(){
bmi=(float)weight/(height*height);
System.out.println("bmi="+bmi);
if (bmi >= 18.5 && bmi<=24.99)
System.out.println("normal weight");
else if (bmi >= 25 && bmi<=29.9)
System.out.println("overweight");
}
public static void main(String[] args){
Health a=new Health(65,1.78);
a.getBMI();
}
}
