


public class Main
{
  public static void main (String[]args)
  {
    String s1 = "Tonmoy\t\t\t";
    String s3 = s1 + s1 + s1;
    String s10 = s3 + s3 + s3 + s1;
    String s30 = s10 + s10 + s10;
    String s100 = s30 + s30 + s30 + s10;
    String s300 = s100 + s100 + s100;
    String s1000 = s300 + s300 + s300 + s100;
    String s3000 = s1000 + s1000 + s1000;
      System.out.println (s3);
}}
