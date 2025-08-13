import java.util.Scanner;

public class G{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    //la variable entera t tiene la cantidad de veces
    //que aparece 't' en s, asi para toda var con nombre de un char
    int t = 0; int a = 0; int p = 0; int u = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'T') t++;
      if(s.charAt(i) == 'A') a++;
      if(s.charAt(i) == 'P') p++;
      if(s.charAt(i) == 'U') u++;
    }
    //hasta aca tenemos orden n 
    int output = 0;

    /*
    while(t > 0 && p > 0 && (a > 0 || u > 0)){
      if(t > 0 && a > 0 && p > 0){ //si puedo formar tap
        output++; t--; a--; p--;
      };
      if(t > 0 && u > 0 && p > 0){ //si puedo formar tup
        output++; t--; u--; p--;
      }
    }
    //el peor caso es n, entonces tenemos 2n
    */

    //se puede hacer mas eficiente

    int tap = Math.min(Math.min(t,a),p); //el minimo entre t,a y p es la cant de tap q hay
    t -= tap; a -= tap; p -= tap; //les resto las palabras tap q puedo formar
    
    int tup = Math.min(Math.min(t,u),p); //el minimo entre t,u y p es la cant de tup q hay
    t -= tup; u -= tup; p -= tup; //les resto las palabras tup q puedo formar
    //estos calculos son orden 1, asi que tenemos orden n 
    output = tap + tup;
    System.out.println(output);
  }
}
