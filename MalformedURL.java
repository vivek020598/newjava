import java.net.MalformedURLException;  
import java.net.URL;  
public class MalformedURL {  
    public static void main(String[] args) {  
        String invalidURL = "htp://example.com";  
        try {  
            URL url = new URL(invalidURL);  
            System.out.println("Valid URL: " + url.toString());  
        } catch (MalformedURLException e) {  
            System.out.println("Malformed URL: " + e.getMessage());  
        }  
    }  
}  