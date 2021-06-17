package org.incorp.i;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 15;
        int b = -27;
        if ((a+b) > 0){
            System.out.println("Cумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 0;
        if(value<=0){
            System.out.println("Красный");
        }
        else{
            if(value>0 && value<=100){
                System.out.println("Желтый");
            }
            else{
                System.out.println("Зеленый");
                //тут я просто проверил как работает изменение в ветке не обращайте внимание на эту строку... Спасибо... С прошедшим днем рождения
            }
        }
    }
    public static void compareNumbers(){
        int a = 100;
        int b = 10;
        if (a>=b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
    }

}
