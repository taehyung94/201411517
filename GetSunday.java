import java.util.Calendar;

class GetSunday{
Calendar c;
public static void main(String[] args){
int nSundays = 0;
Calendar c = Calendar.getInstance();
for(int year = 1901; year <= 2000; year++) {
    for(int month = 0; month < 12; month++) {
        c.set(year,month,1);
        if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
            nSundays++;
        }
    }
}
System.out.print(nSundays);
}
}
