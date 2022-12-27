/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wtprojconsole;

/**
 *
 * @author 91944
 */
import java.util.*;
public class Wtprojconsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int it;
        int qty,cost=0;
        int amt=0;
        while(true)
        {
            System.out.println("\nONLINE SHOPPING WEBSITE\n ITEMS \t COST \n1. SPEAKER \t Rs.3000");
            System.out.println("2. HEADPHONE \t Rs.2000");
            System.out.println("3. EARPHONE \t Rs.1000");
            System.out.println("4. PHONE \t Rs.15000");
            System.out.println("5. TAB \t Rs.20000");
            System.out.println("\nENTER WHICH ITEM YOU WANT TO BUY: ");
            it=in.nextInt();
            System.out.println("\nENTER QUANTITY: ");
            qty=in.nextInt();
            
            
            if(it==1)
            {
            cost=3000;
        }
        else if(it==2)
        {
        cost=2000;
        }
        else if(it==3)
        {
        cost=1000;
        }
        else if(it==4)
        {
        cost=15000;
        }
        else if(it==5)
        {
        cost=20000;
        }
          amt=cost*qty;
          
          System.out.println("Your bill:\nAmount: "+amt);
          
          System.out.println("Do you want to continue? (y/n)");
          char ch=in.next().charAt(0);
//          ch=in.nextLine();
          
          if(ch=='n')
              break;
        }
    }
    
}
