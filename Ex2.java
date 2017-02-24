import java.util.Scanner;

class Ex2
{
 public static void CountProduction(int s,int A)
 {
  int pro=1;
  for (int i=0; i<s; i++)
  {
   pro=pro*A;
   A++;
  }
  
  System.out.println("Proizvedenie = " +pro);
}


  public static void main (String [] args) {

  Scanner sc = new Scanner (System.in);

  System.out.println("Vvedite A: ");
  int A=sc.nextInt();
  System.out.println("Vvedite B: ");
  int B=sc.nextInt();
  int n=B-A+1;
  CountProduction(n, A);
  
 }
}