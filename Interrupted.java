public class Interrupted {  
    public static void main(String[] args) {  
        try {  
            Thread.sleep(5000);  
        } catch (InterruptedException e) {  
            System.out.println("Thread interrupted: " + e.getMessage());  
        }  
    }  
}  