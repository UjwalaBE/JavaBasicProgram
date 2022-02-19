package prog.test;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=200;  
		
        String s=Integer.toString(i);  
		
        System.out.println(i+100);//300 because + is binary plus operator  
		
        System.out.println(s+100);//200100 because + is string concatenation operator  
	
	//************************************************
	
	
        int k=500;  
        
        String str=String.valueOf(i);  
       
        System.out.println(i+100);//600 because + is binary plus operator  
       
        System.out.println(str+100);//600100 because + is string concatenation operator  
	
	
	//***********************************************************
	
 
        String sr = "Ujjwal";
        
        System.out.println(sr.toUpperCase());
        
        System.out.println(sr.toLowerCase());
        
	}
	
	
	
	
	
	
	

}
