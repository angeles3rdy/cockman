import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Animal {

    Date getYesterday() { 

        return new Date(System.currentTimeMillis() - 86400000);

    }
    

}

public class testing  {

    public static void main(String[] args) {

        Animal yest = new Animal();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        long dateToday = System.currentTimeMillis();
        String todays = format.format(dateToday);

        long getYesterday = System.currentTimeMillis() - 86400000;

        if(todays.compareTo(format.format(yest.getYesterday())) == 0) { //january 13

            System.out.println("rj cock = rj cock");
            
        }else if(todays.compareTo(format.format(yest.getYesterday())) > 0) { //january 12

            System.out.println("yung yesterday past na");

        }else if(todays.compareTo(format.format(yest.getYesterday())) < 0) { //magiging kahapon

            System.out.println("yung today is past na");

        }else { 



        }

    }

 
}
