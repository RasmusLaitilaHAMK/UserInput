import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	//Tämä tulee nyt sitten GITHubiin. Hehehehaw
      
       Scanner in = new Scanner(System.in);
      
      
      String nro1;
      String nro2;
      int sum1;
      
      
      String vast1;
      
      System.out.println("Anna numero 1 ");
      nro1 = in.nextLine();
      
      
      System.out.println("Anna numero 2 ");
      nro2 = in.nextLine();
      
      System.out.println("Haluatka summan, miinuksen kertolaskun tai jaon? Kirjoita plus, miinus, kerto tai jako.");
      vast1 = in.nextLine();
      
      
      if (vast1.equals("plus")) 
      {      
      sum1 = Integer.parseInt(nro1) + Integer.parseInt(nro2);
      System.out.println("Tulos on: " + sum1);
      }
      

      if (vast1.equals("miinus")) 
      {
    	  sum1 = Integer.parseInt(nro1) - Integer.parseInt(nro2);
    	  System.out.println("Tulos on: " + sum1);  
      } 
      
      
      if (vast1.equals("kerto")) 
      {
    	  sum1 = Integer.parseInt(nro1) * Integer.parseInt(nro2);
    	  System.out.println("Tulos on: " + sum1);  
      } 
      if (vast1.equals("jako")) 
      {
    	  sum1 = Integer.parseInt(nro1) / Integer.parseInt(nro2);
    	  System.out.println("Tulos on: " + sum1);  
      } 
  }
}