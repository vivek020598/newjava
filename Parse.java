import java.text.DateFormat;  
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
public class Parse {  
    public static void main(String[] args) {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        String invalidDate = "2019-23-60";  
        try {  
            Date parsedDate = dateFormat.parse(invalidDate);  
            System.out.println("Parsed date: " + parsedDate);  
        } catch (ParseException e) {  
            System.out.println("Invalid date format: " + e.getMessage());  
        }  
    }  
}  