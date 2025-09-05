import java.util.Scanner;
public class Question_3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double balance=10000;
        System.out.println("Welcome to KITS ATNM");
        int choice;
        do
        {
            System.out.println("Choose your option \n1.Check Account Balance\n2.Deposit Money\n3.Withdraw Money\n4.Exit the Application\nType your Option Number:");
            choice=sc.nextInt();
            {
            switch(choice)
            {
            case 1:
            {
                System.out.println("Account Balance= "+balance);
                break;
            }
            case 2:
            {
                System.out.println("Enter the amount to be Deposited");
                double depo=sc.nextDouble();
                balance+=depo;
                System.out.println("Successfull");
                break;
            }
            case 3:
            {
                System.out.println("Ente the amount to be Withdrawdn");
                double withdraw=sc.nextDouble();
                if(withdraw>balance)
                    System.out.println("Insufficient Funds in your account");
                else
                {
                    balance-=withdraw;
                    System.out.println("Successfull");
                }
                break;
            }
            case 4:
            {
                System.out.println("Exiting the Application\nGoodBye");
                break;
            }
            default:
                System.out.println("This choice is not Valid\nChoose a Valid choice");
            }
        }
    }while(choice!=4);
    }
}
