package unittest;

/**
 *
 * @author arie
 */
public class HelloWorld {
     private String hello; 

  private String world;         

  public HelloWorld(){  
    hello = "Hello";  
    world = "World"; 
  } 

  public String formMessage(){ 

    String message;  

    message = hello + " " +  world;  

    return message; 

  } 

  public static void main(String[] args) {  

    HelloWorld helloWorld = new HelloWorld();  

    System.out.println(helloWorld.formMessage()); 

  } 
}
