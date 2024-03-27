import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        //task 1
        System.out.println("task 1");
        System.out.println();

        byte [] byteArray = new byte [3];
        byteArray [0] = 1;
        byteArray [1] = 2;
        byteArray [2] = 3;

        float [] floatArray ={1.57F, 7.654F, 9.986F};

        int [] integerArray = new int [5];
        integerArray [0] = 4;
        integerArray [2] = 16;
        integerArray [4] = 49;
/*
Далее просто решил перепроверить, все ли верно в консоли отображается
        System.out.println(Arrays.toString(byteArray));
        System.out.println(Arrays.toString(floatArray));
        System.out.println(Arrays.toString(integerArray));
*/
        System.out.println();
        //task 2
        System.out.println("task 2");
        System.out.println();

        for (byte i = 0; i < byteArray.length; i++) {
            if (i < byteArray.length - 1) {
                System.out.print(byteArray [i] + ", ");
            } else {
                System.out.println(byteArray [i]);
            }
        }

        for (byte i = 0; i < floatArray.length; i++) {
            if (i < floatArray.length - 1) {
                System.out.print(floatArray [i] + ", ");
            } else {
                System.out.println(floatArray [i]);
            }
        }

        for (byte i = 0; i < integerArray.length; i++) {
            if (i < integerArray.length - 1) {
                System.out.print(integerArray [i] + ", ");
            } else {
                System.out.println(integerArray [i]);
            }
        }

        System.out.println();
        //task 3
        System.out.println("task 3");
        System.out.println();

        for (byte i = (byte) (byteArray.length - 1); i >= 0 ; i--) {
            if (i != 0) {
                System.out.print(byteArray [i] + ", ");
            } else {
                System.out.println(byteArray [i]);
            }
        }

        for (byte i = (byte) (floatArray.length - 1); i >= 0; i--) {
            if (i != 0) {
                System.out.print(floatArray [i] + ", ");
            } else {
                System.out.println(floatArray [i]);
            }
        }

        for (byte i = (byte) (integerArray.length - 1); i >= 0; i--) {
            if (i != 0) {
                System.out.print(integerArray [i] + ", ");
            } else {
                System.out.println(integerArray [i]);
            }
        }

        System.out.println();
        //task 4
        System.out.println("task 4");
        System.out.println();

        for (byte i = 0; i < byteArray.length; i++) {
            if ((byteArray [i] % 2) != 0) {
                byteArray [i] = (byte) (byteArray [i] + 1);
                System.out.print(byteArray [i] + ", ");
            } else {
                System.out.print(byteArray [i] + ", ");
            }
        }

        System.out.println();

//Чтобы не было запятой в конце строки в консоли, код получился посложнее

        for (byte i = 0; i < byteArray.length; i++) {
            if ((byteArray [i] % 2) != 0 && i < byteArray.length - 1) {
                byteArray [i] = (byte) (byteArray [i] + 1);
                System.out.print(byteArray [i] + ", ");
            } else if ((byteArray [i] % 2) == 0 && i < byteArray.length - 1) {
                System.out.print(byteArray [i] + ", ");
            } else {
                System.out.print(byteArray [i]);
            }
        }

        System.out.println();

    }
}