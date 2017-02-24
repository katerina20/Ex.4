import java.util.Scanner;

class Ex5
{
 public static void CountFactorial(float N)
 {
  double fak=1;
  for (; N>0; N--)
  {
   fak=fak*N;
  }
  
  System.out.println("Factorial = " +fak);
}


  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("Vvedite N: ");
  int N=sc.nextInt();
  CountFactorial(N);
  
 }
}