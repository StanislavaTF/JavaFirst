/**
* Java 1. Lesson 3
* @autor Stanislava P
* @ version 23.01.2022
*/

import java.util.Arrays;

class LessonTree {
    public static void main(String[] args) {
    oneZero (0, 1);
    mas1(2);
    mas2(5, 5);
    oneHundred(100);
    mas3(10,32);
    }

    static void oneZero(int o, int z) {
        int[] arrOne= {o,z,z,z,z,o,o,o,o,o};
        System.out.println(Arrays.toString(arrOne));
        for (int i= 0; i< arrOne.length; i++){
            if (i >0) {
            arrOne[i] = 1- arrOne[i];
            } else {
                arrOne[i]=arrOne[i]+1;
                }
        }
        System.out.println(Arrays.toString(arrOne));
    }

    static void mas1(int v) {
        int[] arrTree= {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(arrTree));
        for (int i= 0; i< arrTree.length; i++){
            if (arrTree[i]<6) {
            arrTree[i] *= v;
            }
        }
        System.out.println(Arrays.toString(arrTree));
    }

    static void mas2(int v, int w) {
        int[][] arrFour= new int[v][w];
        for (int i= 0; i< arrFour.length; i++){
            arrFour[i][i]=1; 
            arrFour[i][arrFour.length-i-1] = 1;
            }
        for (int i= 0; i< arrFour.length; i++) {
        System.out.println(Arrays.toString (arrFour[i]));
        }
    }

    static void oneHundred(int x) {
        int[] arrTwo = new int[x];
        for (int i=0; i< arrTwo.length; i++) {
            arrTwo[i]= i; 
        }
        System.out.println(Arrays.toString(arrTwo));
    }

    static void mas3(int len, int initialValue) {
        int [] arrFive = new int [len];
        for (int i= 0; i< arrFive.length; i++) {
            arrFive[i]= initialValue;;
        }
        System.out.println(Arrays.toString(arrFive));
        }
}
