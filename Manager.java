import java.util.Scanner;


public class Manager {

    public static void main(String[] args) {
        IoFunction ioFunction=new IoFunction();
          
        System.out.println("\nWelcome to Notes Manager");
        Scanner sc=new Scanner(System.in);
        boolean running=true;
        
        while(running){
            System.out.println("\nEnter 1 to write to file , 2 to read from file & 3 to Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the file name to write to");
                    String filename=sc.next();
                    sc.nextLine();
                    System.out.println("Enter the content to be written");
                    String content=sc.nextLine();
                    System.out.println("Written Succesfully");
                    try{
                        ioFunction.writeToFile(content, filename);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    
                    break;
                      case 2:
                        System.out.println("Enter the file name to read from");
                        String fname=sc.next();
                        try {
                            ioFunction.readFromFile(fname);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    
                    break;
                      case 3:
                        running=false;
                    
                    break;
            
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
       
        System.out.println("Thank you for your time");
     

       
    }
}
