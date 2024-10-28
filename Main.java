import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double alcool = 0;
    double gasolina = 0;
    double diesel = 0;
    double x = sc.nextDouble();

    
    while (x != 4){
      if (x == 1 ){
        alcool=alcool + 1;
      } else if (x == 2 ){
        gasolina=gasolina + 1;
      } else if (x == 3 ){
        diesel=diesel + 1;
      } else if (x >= 5 || x <= 0 ){
    }
      x = sc.nextDouble();
    }
    System.out.printf("MUITO OBRIGADO %nAlcool: %.0f%nGasolina: %.0f%nDiesel: %.0f%n", alcool, gasolina, diesel);
  
      sc.close();
    }
}
