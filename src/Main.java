import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------");
        System.out.println("| x  |   y |");
        System.out.println("-------------");
        for (double x = 0; x < 1; x+=0.1) {

            double y=x*x-2*x-3;

            System.out.println("|"+x+"  |  "+y+"|");
        }

//        for (int i = 0; i < 6; i++) {
//            System.out.println("vvedi znacheni");
//            int x= sc.nextInt();
//            System.out.println(x);
//        }
        for (int h = 0; h < 10; h+=0.1) {
            int fx = 2 * h * h + 2 * h - 7;
            if (fx == 0) {
                System.out.println(h);
            }else{
                System.out.println("net");
            }

        }


    }
}