import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Задача 1;
        System.out.println("Задача 1");
        int [] first = new int [] { 1, 2, 3 } ;
        float [] two = {1.57f, 7.654f, 9.986f} ;
        int [] free = new int [10] ;
        //Задача 2;
        System.out.println("Задача 2");
        for (int i = 0; i < first.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(first[i]);
        }
        System.out.println();
        //Задача 3;
        System.out.println("Задача 3");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        double[] klop = {1.57, 7.654, 9.986};
        int[] boll = {3, 12, 20};
        System.out.println("задание 2");
        for (int i = 0; i < box.length; i++) {
            if (i < box.length - 1) {
                System.out.print(box[i] + ", ");
            } else {
                System.out.print(box[i]);
                System.out.println();
                for (int i1 = 0; i1 < klop.length; i1++) {
                    if (i1 < klop.length - 1) {
                        System.out.print(klop[i1] + ", ");
                    } else {
                        System.out.print(klop[i1]);
                        System.out.println();
                        ///
                        for (int i2 = 0; i2 < boll.length; i2++) {
                            if (i2 < boll.length - 1) {
                                System.out.print(boll[i2] + ", ");
                            } else {
                                System.out.print(boll[i2]);
                            }
                            for (int r = 0; r < boll.length; r++) {
                                System.out.print(boll[r]);
                                if (r < boll.length - 1) {
                                    System.out.print(", ");
                                    //Задача 4;
                                    System.out.println("Задача 4");
                                    int[] boxe = {1, 2, 3};

                                    for (int iq = 0; iq < boxe.length; iq++) {
                                        if (boxe[iq] % 2 != 0) {
                                            boxe[iq] += 1;
                                        }
                                    }

                                    System.out.println(Arrays.toString(box));  }}}}}}}}}