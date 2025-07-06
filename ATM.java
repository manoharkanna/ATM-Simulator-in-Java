import java.util.Scanner;
class ATM{
  static Scanner input = new Scanner(System.in);
  static int loginpass=1234;
  static int balance=10000;
  public static void main(String[] args){
   System.out.println("Enter the pin");
   int pass=input.nextInt();
   int choice;
   if(pass==loginpass){
     System.out.println("you entered successfully");
    do{
      options();
       choice=input.nextInt();
      switch (choice) {
        case 1:
          withdraw();
          break;
        case 2:
          checkBalance();
          break;
        case 3:
        System.out.println("Thank you for using our ATM. Goodbye!");
          break;
        default:
        System.out.println("invalid option");
          break;
      }


    }while(choice != 3);
   }
   else{
    System.out.println("You enter the invalid pin");
   }
  }
  public static void options(){
    System.out.println("\n-----ATM MENU-----");
    System.out.println("1,Withdraw");
    System.out.println("2,Check Balance");
    System.out.println("3,Exit");
    System.out.println("Choose an option");
  }
  public static void withdraw(){
    System.out.println("Enter the amount to withdraw:");
    int amount=input.nextInt();
    if(amount>balance || amount<=0){
      System.out.println("insufficent amount");
    }
    else{
      balance-=amount;
      System.out.println("Your Balance amount is:"+balance);
    }
  }
  public static void checkBalance(){
      System.out.println("Balance amount is:"+balance);
  }
 
}