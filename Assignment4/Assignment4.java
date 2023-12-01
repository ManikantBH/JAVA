class Assignment4
{
      static void add()
      {
         int a=20;
         int b=70;
         int c=a+b;
         System.out.println(c);
         return;
      }
      static void sub()
      {
         int d=70;
         int e=20;
         int f=d-e;
         System.out.println(f);
         return;
      }
      static void mul()
      {
         int g=7;
         int h=7;
         int i=g*h;
         System.out.println(i);
         return;
      }
      static void div()
      {
         int j=20;
         int k=5;
         int l=j/k;
         System.out.println(l);
         return;
      }
      static void mod()
      {
         int m=30;
         int n=5;
         int o=m%n;
         System.out.println(o);
         return;
      }
      public static void main(String[] args)
      {
         System.out.println("----Main starts----");
         add();
         sub();
         mul();
         div();
         mod();
         System.out.println("----Main Ends----");
      }
} 
