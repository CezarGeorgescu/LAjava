public class Hello {
    public static void main(String[] args) {
        int myAge;

        float weight = 60.5f;
        double height = 356.6;
        char gender = 'm';
        char test = 9;
        boolean isStudent = true;
        boolean hasJob = false;
        String mesaj = "hello";
        String mesaj2 = "goodbye";
        String mesaj3 = mesaj + mesaj2;
        System.out.println(mesaj3);
        double a = 5;
        int b = 2;
        double c = a / b;
        System.out.println(c);

        int x = 29;
        boolean prim = true;
        int n;
        for (n = 2; n <= x / 2; n++) {
            if (x % n == 0) {
                System.out.print("Numarul nu este prim ");

                prim = false;
                break;

            }


        } if (prim) System.out.println("numarul este prim ");




    }
}