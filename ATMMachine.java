import java.util.Scanner;
 class ATMMachine {
      float Balanace;
      int PIN=5674;
      public void checkpin(){
            System.out.println("Enter your pin: ");
            Scanner sc=new Scanner(System.in);
            int enteredpin=sc.nextInt();

            if(PIN==enteredpin)
            {
                  menu();
            }
            else{
                 System.out.println("Enter a valid pin") ;
            
            }
      }
      public void menu(){
            System.out.println("Enter your cjoice");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposite Mony");
            System.out.println("4. EXIT");
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();

            if(opt==1)
            {
                  checkBalance();
            }
            else if(opt==2)
            {
                  withdrawMoney();
            }
            else if(opt==3)
            {
                  depositMoney();
            }
            else if(opt==4)
            {     
                 
                  return;
            }
            else{
                  System.out.println("Enter the valid choice");
            }
      }
      public void checkBalance(){
            System.out.println("Balance:"+Balanace);
            menu();
      }
      public void withdrawMoney(){
            System.out.println("Enter Amout to Withdrawl");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextInt();
            if(amount > Balanace)
            {
                  System.out.println("Insufficient Balance");
            }
            else{
                  Balanace=Balanace-amount;
                  System.out.println("Money Withdrawl Successfull ");
            }
            menu();
      }
      public void depositMoney(){
            System.out.println("Enter the Amout ");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextInt();
            Balanace=Balanace+amount;
            System.out.println("Money Deposite Successfully");
           
            menu();
      }

      public static void main(String[] args)
      {
            ATMMachine obj=new ATMMachine();
             obj.checkpin(); 
      }

}
// public class ATMMachine extends ATM{
     
// }