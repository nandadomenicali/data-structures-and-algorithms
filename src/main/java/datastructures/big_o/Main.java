package main.java.datastructures.big_o;

public class Main {

    public static void printItems(int n) {
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }

        for(int j = 0; j < n; j++){
            System.out.println(j);
        }
    }

    public static void printAnotherItems(int n) {
        for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               System.out.println(i + " " + j);
           }
        }
    }

    public static void main(String[] args) {
        //printItems(10);
        printAnotherItems(10);
    }

}
