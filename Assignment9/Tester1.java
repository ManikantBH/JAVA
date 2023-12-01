class Demo1
{
     static void circle(int r)
        {
           final double pi=3.142;
           double result=pi*r*r;
           System.out.println(result);
        }
     static void square(int a)
        {
           int result=a*a;
           System.out.println(result);
        }
     static void triangle(int b,int h)
        {
           double result=0.5*b*h;
           System.out.println(result);
        }
     static void rectangle(int w,int h)
        {
           int result=w*h;
           System.out.println(result);
        }
     static void parallelogram(int b,int h)
        {
           int result=b*h;
           System.out.println(result);
        }
     static void tapezoid(int a,int b,int h)
        {
           double result=0.5*a+b*h;
           System.out.println(result);
        }
     static void ellipse(int a,int b) 
        {
           final double pi=3.142;
           double result=pi*a*b;
           System.out.println(result);
        }
      static void sector(int r,int t)
        {
           double result=0.5*r*r*t;
           System.out.println(result);
        }          
}
     class Tester1
        {
           public static void main(String[] args)
           {
             Demo1.circle(2);
             Demo1.square(2);
             Demo1.triangle(2,4);
             Demo1.rectangle(2,4);
             Demo1.parallelogram(3,6);
             Demo1.tapezoid(2,4,6);
             Demo1.ellipse(3,5);
             Demo1.sector(8,45);
           }
        }
             
   