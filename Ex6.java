import java.util.Scanner;

class Ex6
{
 public static void CountFibonachchi(int N)
 {
  int fib=0;
  int a=1;
  int b=1;

  System.out.print(a + " " + b);

  for (int i=0; i<(N-2); i++)
  {
   fib=a+b;
   a=b;
   b=fib;
   System.out.print(" "+fib);
  }
}


  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("Vvedite N: ");
  int N=sc.nextInt();
  CountFibonachchi(N);
  
 }
}