import java.util.Scanner;

class Ex1
{
 public static void CountSum(int s,int A)
 {
  int sum=0;
  for (int i=0; i<s; i++)
  {
   sum+=A;
   A++;
  }
  
  System.out.println("Summa = " +sum);
}


  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("Vvedite A: ");
  int A=sc.nextInt();
  System.out.println("Vvedite B: ");
  int B=sc.nextInt();
  int n=B-A+1;
  CountSum(n, A);
  
 }
}