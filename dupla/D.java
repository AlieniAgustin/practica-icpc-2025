import java.util.Scanner;

public class D{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    char respuesta = 'N';
    if(a >= b + c || b >= a + c || c >= a + b)
      respuesta = 'S';
    
    System.out.println(respuesta);
  }
}
