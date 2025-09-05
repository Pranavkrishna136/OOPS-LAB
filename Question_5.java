import java.util.*;
public class Question_4 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int ran=r.nextInt(101);
        System.out.println("A Random Number is Created You have to Guiess it Good Luck!");
        int chance=1,num;
        do
        {
            System.out.println("Enter Your Guess Number");
             num=sc.nextInt();
            if(num==ran)
            
                System.out.println("You Got it Right on the "+chance+" chance");
            
            else if(num>ran)
            {
                System.out.println("Your Guess is too High");
                chance++;
            }
            else if(num<ran)
            {
                System.out.println("Your Guess is Too Low");
                chance++;
            }
        }while(num!=ran); 
    }
}
