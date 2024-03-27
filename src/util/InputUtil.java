package util;

import java.util.Scanner;

public class InputUtil {
    public static String InputRequiredStr(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextLine();

    }

    public static int InputRequiredInt(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextInt();
    }

    public static Double InputRequiredDbl(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextDouble();
    }




}
