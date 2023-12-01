class Amazon
{
    static void homepage()
      {
        System.out.println("homepage");
      }
    static void logout()
      {
        System.out.println("logging out");
      }
    static void order()
      {
        System.out.println("order");
      }
    public static void main(String[] args)
      {
       System.out.println("----Amazon starts----");
       signup();
       login();
       homepage();
       order();
       logout();
       System.out.println("----Amazon Ends----");
      }
    static void login()
      {
        System.out.println("logging in");
      }
    static void signup()
      {
        System.out.println("signing up");
      }
}