class Tester5
{
    public static void main(String[] args)
     {
         int num=21;
         if(num%3==0 && num%7==0)
         {
           System.out.println("Fizz Buzz");
         }
         else if(num%3==0)
         {
           System.out.println("Fizz Fizz");
         }
         else if(num%7==0)
         {
           System.out.println("Bizz Bizz");
         }
         else
         {
           System.out.println("Invalid number");
         }
    }
}