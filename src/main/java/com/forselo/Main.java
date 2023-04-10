package com.forselo;

public class Main {
    public static void main(String[] args){

        int i = 10;
        double d = 0.9;
        float f = 0.0999F;
        char ch = 'a';
        boolean a = true;
        boolean b = false;
        String petr = "petr";

        //Математические операторы и комбинация int и double
        System.out.println("Математические операторы и комбинация int и double");
        System.out.println("10+'a' = \""+i+ch + "\"");
        System.out.println("10+'a' = "+(i+ch));
        System.out.println("10+0.9 = \""+i+d + "\"");
        System.out.println("10+0.9 = "+(i+d));
        System.out.println("10+0.9+0.0999F = "+(i+d+f));
        System.out.println("10/0.9 = "+i/d);
        System.out.println("10%0.9 = "+i%d);
        System.out.println("10%3 = "+i%3);
        System.out.println("(10/0.9)*0.9 = "+(i/d)*d);
        int j = (int) d;
        System.out.println("(int) 0.9 = " + j);
        System.out.println("10++ = " + i++); //инкремент после операции
        System.out.println("++11 = " + ++i); //инкремент до операции

        //Операторы сравнения
        System.out.println("Операторы сравнения");
        System.out.println("10==0.90 = "+(i==d));
        System.out.println("10==10 = "+(i==i));
        System.out.println("10!=10 = "+(i!=i));
        System.out.println("10>0.9 = "+(i>d));

        //Логические операторы
        System.out.println("Логические операторы");
        System.out.println("true&&false = "+ (a && b));
        System.out.println("true||false = "+ (a || b));
        System.out.println("!true = "+ (!a));
        System.out.println("\"petr\"==\"petr\" = " + ("petr" == petr)); //не получилось false получить
        String c = (a || b) ? "true" : "false";

        //Переполнение
        System.out.println("Переполнение");
        i = Integer.MAX_VALUE;
        System.out.println("i = " + i);
        System.out.println("i + 1 - 1 = " + ((i+1)-1));
        System.out.println("i + 1 = " + (i+1));

    }
}