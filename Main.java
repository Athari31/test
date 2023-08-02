 import javax.swing.*;
 import java.util.Scanner;

 
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;

 // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 public class Main {
     public static void main(String[] args) {
         boolean x=true;


         employee e1 =new employee();
         e1.name="A";
         employee e2 =new employee();
         e2.name="B";
         employee e3 =new employee();
         e3.name="C";
         employee e4 =new employee();
         e4.name="D";
         employee e5 =new employee();
         e5.name="E";


         List<employee> emplList=new ArrayList<>();
         emplList.add(e1);
         emplList.add(e2);
         emplList.add(e3);
         emplList.add(e4);
         emplList.add(e5);

         employee y1 =new employee();
         e1.Gmail="A";
         employee y2 =new employee();
         e2.Gmail="B";
         employee y3 =new employee();
         e3.Gmail="C";
         employee y4 =new employee();
         e4.Gmail="D";
         employee y5 =new employee();
         e5.Gmail="E";

         List<employee> employeeListList=new ArrayList<>();
         emplList.add(e1);
         emplList.add(e2);
         emplList.add(e3);
         emplList.add(e4);
         emplList.add(e5);

         employee z1 =new employee();
         e1.Number="A";
         employee z2 =new employee();
         e2.Number="B";
         employee z3 =new employee();
         e3.Number="C";
         employee z4 =new employee();
         e4.Number="D";
         employee z5 =new employee();
         e5.Number="E";

         List<employee> employeeListListNumber=new ArrayList<>();
         emplList.add(z1);
         emplList.add(z2);
         emplList.add(z3);
         emplList.add(z4);
         emplList.add(z5);

         List attList = new ArrayList();

         Scanner scan = new Scanner(System.in);
         while (true) {
             System.out.println("Enter 1  (new Registertion ) or 2 (login) or 3 (Exit)");
             int input = scan.nextInt();
             switch (input) {
                 case 1:
                     System.out.println("Enter your name");
                     String empyName = scan.next();
                     System.out.println("Enter your gmail");
                     String empyGmIL = scan.next();
                     if (emplList.contains(e1) || emplList.contains(e2) ||emplList.contains(e3) || emplList.contains(e4) || emplList.contains(e5)) {
                         if (attList.contains(empyName)) {
                             System.out.println("you already Register");
                             break;
                         }
                         attList.add(empyName);
                         System.out.println(" user added to Registertion list");

                     } else
                         System.out.println("no match");
                     break;
                 case 2:
                     if (attList.equals(emplList)){

                         x=false;
                         break;
                     }
                     else {

                         System.out.println(" Attend employee today :" + attList);
                         break;

                     }
                     //call function

                 case 3:
                     System.out.println("Thank you");
                     System.exit(0);
                 default:
                     System.out.println("No such choice");

             }

         }
     }
 }


 class employee{

     employee(){

     }

     String name;
     String Gmail;

     String Number;

 }
 class Registertion {

     String name;
     int att;
     String Gmail;

 }




