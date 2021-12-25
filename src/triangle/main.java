package triangle;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Triangle t = new Triangle();

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());

        t.a = a;
        t.b = b;
        t.c = c;

        System.out.println("周长：" + t.get_zhouChang());
        System.out.println("面积： " + t.get_mianJi());
    }

}
