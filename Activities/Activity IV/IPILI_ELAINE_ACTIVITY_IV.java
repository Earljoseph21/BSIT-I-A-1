
import java.util.Scanner;
  public class IPILI_ELAINE_ACTIVITY_IV{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER COLOR");
        String color = sc.nextLine();

        switch(color){
           case "RED":
           System.out.println("NUMBER 1");
           break;
           case "GREEN":
           System.out.println("NUMBER 2");
           break;
           case "BLACK":
           System.out.println("NUMBER 3");
           break;
           default:
           System.out.print("NONE"); 
          }
        }
    }