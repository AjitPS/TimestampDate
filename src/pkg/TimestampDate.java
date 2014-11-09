package pkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ajit
 * @Date 09-11-2014
 * Get 1 June 2014 from 41971.
 */
public class TimestampDate {
    public static void main(String[] args) {
        try {
            int num= 41971;
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date(num * 1000L)));
            
            SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
            String sampleDate= "01/06/2014";
            Date demoDate= formatter.parse(sampleDate);
            long unixTimestamp= demoDate.getTime() / 1000L;
            System.out.println("sampleDate: "+ sampleDate +" --> unixTimestamp= "+ unixTimestamp);
        } catch (ParseException ex) {
            Logger.getLogger(TimestampDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
