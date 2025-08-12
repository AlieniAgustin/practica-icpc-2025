import java.util.Scanner;

public class dupla{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese 3 enteros separados por espacio: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    char respuesta = 'N';
    if(a >= b + c || b >= a + c || c >= a + b)
      respuesta = 'S';
    
    System.out.print(respuesta);
  }
}
