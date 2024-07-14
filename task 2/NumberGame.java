import java .util .Random;
import java.util.Scanner;
class NumberGame
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int random_number=random.nextInt(100)+5;
        
        int guess,score=0;
        char ch;
        int attempt=10;
       
        do
        {
            System.out.println("enter the Guessing  number between 1 to 100");
            guess=sc.nextInt();
            for(int i=1;i<=attempt;i++)
            {
                
                if(guess==random_number)
                {
                    System.out.println("your guess is wright");
                    System.out.println(i+":- the number ofattend to win your game");
                    score=attempt-1;
                    break;
                }
                else if(guess>random_number)
                {
                    System.out.println("your guess is too high");
                    System.out.println("enter the Guessing  number between 1 to 100");
                    guess=sc.nextInt();
                }
                else 
                {
                    System.out.println("your guess is low");
                    System.out.println("enter the Guessing  number between 1 to 100");
                    guess=sc.nextInt();
                }
            }
            
            System.out.println("do you want again this game");
            ch=sc.next().charAt(0);
        }while(ch=='y' ||ch=='Y');
    }
    
}