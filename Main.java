import java.util.Scanner;


public class Main {
static Scanner input=new Scanner(System.in);
 public static void main(String[] args) {
double dkkenar1,dkkenar2,hipo;
     System.out.print("Dik kenarı Giriniz:");
     dkkenar1=input.nextDouble();
     System.out.print("Diger dik kenari giriniz:");
     dkkenar2=input.nextDouble();
      dkkenar1*=dkkenar1;
      dkkenar2*=dkkenar2;
     hipo = dkkenar1 + dkkenar2;
      hipo=Math.sqrt(hipo);
     System.out.println("Hipotenüs:"+hipo);
    }
}