package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radix = Integer.parseInt(sc.nextLine());
        long num;
        if (radix == 1) {
            num = sc.nextLine().length();
        } else {
            num = Long.parseLong(sc.nextLine(), radix);
        }
        int toRadix = sc.nextInt();

        if (toRadix == 1) {
            for (int i = 0; i < num; i++) {
                System.out.print(1);
            }
        } else {
            System.out.println(Long.toString(num, toRadix));
        }
    }
}
