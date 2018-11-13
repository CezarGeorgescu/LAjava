public class Switch {
    public static void main(String[] args) {
        int state = 0;
/*
        if(state == 0) System.out.println("Descarcata");
        else if (state == 1) System.out.println("Partial incarcata");
        else if (state == 2) System.out.println("Complet incarcata");
        else System.out.println("Eroare de sistem");*/
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
             break;

     }
    }


}
