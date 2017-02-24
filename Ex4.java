import java.util.Scanner;

class Ex4
{
 public static void CountSum(float A, int N)
 {
  float sum=0;
  for (; N>=0; N--)
  {
   sum+=Math.pow(-1,N)*Math.pow(A,N);
  }
  
  System.out.println("Summa = " +sum);
}


  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("Vvedite A: ");
  float A=sc.nextFloat();
  System.out.println("Vvedite N: ");
  int N=sc.nextInt();
  CountSum(A, N);
  
 }
}