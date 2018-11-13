import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int state = 0;
/*
        if(state == 0) System.out.println("Descarcata");
        else if (state == 1) System.out.println("Partial incarcata");
        else if (state == 2) System.out.println("Complet incarcata");
        else System.out.println("Eroare de sistem");
     switch(state)
     {
         default:
             System.out.println(" Eroare ");
             break;
         case 0:
             System.out.println("descarcata");
             break;
         case 1:
             System.out.println("Partial incarcata");
             break;
         case 2:
             System.out.println("Complet incarcata");
             break; */
  /*int ora;
        System.out.println(" Introdu ora!");
         Scanner reader = new Scanner(System.in);
         ora = reader.nextInt();
         String mesaj;
         mesaj = (ora < 12) ? " Neata " : " Salut!";
        System.out.println(mesaj);*/
  int i,j;
  for( i=1;i<=9;i++)
  { for( j=1;j<=9;j++){
      System.out.println(i + " x " + j + " = " + i*j);
        }
      System.out.println("----------");
     }

    }


}
