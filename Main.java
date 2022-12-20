import java.util.*;
public class Main {
    public static void main(String[] args)
    {
   //kişilerin duvardan atlamsı için gereken kutu sayısı nedir?


    System.out.println("Lütfen değerleri giriniz");


        System.out.println("kutunun yüksekliğini girinzi");

        Scanner box = new Scanner(System.in);
        int n = box.nextInt();
        int t =n;

        System.out.println("lütfen duvar yüksekliği giriniz");

        Scanner wall = new Scanner(System.in);
        int m = wall.nextInt();
        int q =m;

        System.out.println("lütfen kişi sayısını giriniz");

        Scanner person = new Scanner(System.in);
        int y = person.nextInt();

        for (int e= 1; e<=y;y=y-1) {


            System.out.println("lütfen kişi boylarını giriniz giriniz");

            Scanner PersonSize = new Scanner(System.in);
            int z = PersonSize.nextInt();
            n=t;
            m=q;
            int a = 0;
            if (n + z > m) {
                System.out.println(z + "," + m + "," + a);
            }


            for (int b = n; n + z <= m; n = n + b) {

                a = a + 1;
            }
            a = a + 1;
            System.out.println(z + "," + m + "," + a);

        }


    }
}