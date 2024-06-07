public class ClassNotFoundd {  
    public static void main(String[] args) {  
        try {  
            Class<?> clazz = Class.forName("NonExistentClass");  
        } catch (ClassNotFoundException e) {  
            System.out.println("Class not found: " + e.getMessage());  
        }  
    }  
}  