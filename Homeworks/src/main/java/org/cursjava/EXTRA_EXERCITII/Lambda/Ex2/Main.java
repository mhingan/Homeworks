package org.cursjava.EXTRA_EXERCITII.Lambda.Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exemplu1();
        exemplu2();
        exemplu3();
        exemplu4();
    }

    public static void exemplu1(){
        Practice adunare = (a, b) -> a + b;
        int rezultat = adunare.apply(5, 7);
        System.out.println(rezultat);
    }

    public static void exemplu2(){
        Practice scadere = (a, b) -> a - b ;
        int result = scadere.apply(8,9);
        System.out.println(result);
    }

    public static void exemplu3(){
        List<Integer> list = Arrays.asList(89,76,54,98,77,66,44,76,98,123,456,78);

        // (a, b) -> a.compareTo(b) || Comparator.reverseOrder() -> list descendent;
        // (a, b) -> b.compareTo(a) || Comparator.naturalOrder() -> list ascendant;
        list.sort(Comparator.naturalOrder());
        //list.sort((a, b) -> (a>290) ? a.compareTo(b) : b.compareTo(a)  );
        System.out.println(list);
    }

    public static void exemplu4(){
        Practice celMaiMareNumar = (a, b) -> (a > b) ? a : b;
        int rezult = celMaiMareNumar.apply(-9,8);
        System.out.println(rezult);
    }
}
