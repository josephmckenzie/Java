//To set an env in ubuntu $ export envname=envvalue
//then we can call it in our java using System.getenv("testing");
// Still need to figure out how to do it using a env file , I'm sure you can so I will figure that out as well

public class envs {   

    public static void main(String args[]){
    
      //Gets the system username using System.getProperty
       String username = System.getProperty("user.name") ;
       System.out.println("Username using system property: "  + username);
    
     //getting the 'testing' environment variable in java
       String testing = System.getenv("testing");
       System.out.println("Get any environment variable set in the system in ubuntu : "  + testing);
        }
    }
      


