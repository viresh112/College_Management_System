import java.*;
import java.util.Scanner;     
                                                      
interface Sample{
       
       Scanner s=new Scanner(System.in);
       public void getData();
}
interface Sample1 extends Sample{
      public void getMarks();
      public void percentage();
}

class Display implements Sample,Sample1{

       int rollNo;
       String name;
       String branch;
       String clgName; 
       double per;
       int m1,m2,m3,add;

      public void getData(){
            System.out.println("Enter your name:");
            name=s.next();
            System.out.println("Enter your rollNo:");
            rollNo=s.nextInt();   
            System.out.println("Enter your branch:"); 
            branch=s.next(); 
            System.out.println("Enter your clgName:"); 
            clgName=s.next(); 
       }    

       public void getMarks(){
            System.out.println("Enter your Marks:");
            m1=s.nextInt();
            m2=s.nextInt();  
            m3=s.nextInt(); 
      }

      public void percentage() {
            add=m1+m2+m3;             
            per=add/3;           
        }

      public void disp() {
            System.out.println("Name:"+name); 
            System.out.println("Roll No:"+rollNo);
            System.out.println("Branch:"+branch);
            System.out.println("ClgName:"+clgName);
            System.out.println("Total:"+add);
            System.out.println("Percentage:"+per); 
            System.out.println("Name:"+name+"\r\n"+"Roll No:"+rollNo+"\r\n"+"Branch:"+branch+"\r\n"+"College Name:"+clgName+"\r\n"+"Total:"+add+"\r\n"+"Percentage:"+per+"\r\n");

      }      
}
public class Inheritance {
      public static void main(String[] args) {
            
            Display d= new Display();
            
            d.getData();
            d.getMarks();
            d.percentage();
            d.disp();

      }
}