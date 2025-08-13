import java.util.Scanner;

public class F {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Leer N
    int N = sc.nextInt();
    sc.nextLine(); // consumir el salto de línea después de N
    // Leer la línea con N números
    String[] tokens = sc.nextLine().split(" ");
    // Pasar de String[] a int[]
    int[] numeros = new int[N];
    for (int i = 0; i < N; i++)
        numeros[i] = Integer.parseInt(tokens[i]);
    int acum = 0;
    int puntaje = 0;
    for(int i = 0; i < N; i++){
      if(numeros[i] == 1){
        puntaje++;acum++;
      }else{
        puntaje--;acum = 0;
      }
      if(acum >= 3) puntaje++;
    }
    System.out.println(puntaje);
  }
}
