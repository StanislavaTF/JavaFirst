/**
* Java 1. Lesson 2
* @autor Stanislava P
* @ version 18.01.2022
*/


class LessonTwo {
    public static void main(String [] args) {
        within10and20(7, 8);
        within10and20(-12, 6);
		
        isPositiveOrNegative(-6);
        isPositiveOrNegative(123);
		
        System.out.println(isNegative (13));
        System.out.println(isNegative (-33));
		
        printString("Eh bien, mon prince.", 9);
    }
	
    static boolean within10and20(int a, int b) {
        return a+b >= 10 && a+b <= 20;
        }
	
    static void isPositiveOrNegative(int x) {
        System.out.println(x >= 0 ? "Positive" : "Negative");
        }
	
    static boolean isNegative(int c) {
        return c < 0 ;
        }
	
    static void printString(String line, int amt) {
        for (int i = 0; i < amt; i++)
            System.out.println (line);
        }
}
