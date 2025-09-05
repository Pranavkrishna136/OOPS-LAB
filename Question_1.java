import java.util.Scanner;
public class Question_1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ente your age: ");
        int age=sc.nextInt();
        System.out.print("Ente the day number of your booking \nMon=1\tTue=2\tWed=3\tThu=4\tFri=5\tSat=6\tSun=7 : ");
        int daynum=sc.nextInt();
        double price=200.0;
        if(age<5)
        {
            System.out.println("Free Ticket");
            price=0.00;
        }
        else if(age>5&&age<18)
        {
            System.out.println("40% Discount");
            price=price-(price*0.40);
        }
        else if(age>19&&age<60)
        {
            System.out.println("No Discount");
        }
        else if(age>60)
        {
            System.out.println("30% Discount");
            price=price-(price*0.30);
        }
        if(daynum==1||daynum==2||daynum==3||daynum==4||daynum==5)
        {
            System.out.println("You have additional 10% Discount ");
            price=price-(price*0.10);
        }
        System.out.println("Final Ticket Price After Discount: "+ price);
    }
}
