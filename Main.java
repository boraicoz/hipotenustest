import java.util.Scanner;


public class Main {
static Scanner input=new Scanner(System.in);
 public static void main(String[] args) {
double dkkenar1,dkkenar2,hipo;
    //Ornekler
     System.out.print("Dik kenarı Giriniz:");
     dkkenar1=input.nextDouble();
     System.out.print("Diger dik kenari giriniz:");
     dkkenar2=input.nextDouble();
      dkkenar1*=dkkenar1;
      dkkenar2*=dkkenar2;
     hipo = dkkenar1 + dkkenar2;
      hipo=Math.sqrt(hipo);
     System.out.println("Hipotenüs:"+hipo);
     // Odev
     double a,b,c,alan,u;
     System.out.print("Birinci kenari giriniz:");
     a=input.nextDouble();
     System.out.print("İkinci kenari giriniz:");
     b=input.nextDouble();
     System.out.print("Ucuncu kenari giriniz:");
     c= input.nextDouble();
     u=(a+b+c)/2;
     alan=u*(u-a)*(u-b)*(u-c);
     System.out.println("Ucgenin Alani:"+ Math.sqrt(alan));
 }
}