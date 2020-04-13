
public class ExamSingleton { 
    
    private static ExamSingleton singleton = null; 
    public String joke;
    public static void tellJoke() 
    { 
        System.out.println("Is it a joke?"); 
        
    } 
  
     public static ExamSingleton createInstance() 
    { 
        if (singleton == null) 
        	singleton = new ExamSingleton(); 
  
        return singleton; 
    } 
} 
