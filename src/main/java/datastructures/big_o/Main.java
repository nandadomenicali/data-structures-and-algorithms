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

    // different terms for inputs
    public static void printDiffItems(int a, int b) {
        for(int i = 0; i < a; i++){
            System.out.println(i);
        }

        for(int j = 0; j < b; j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        //O(n)
        printItems(10);

        // O(nˆ2) | n * n = nˆ2
        printAnotherItems(10);

        //O(a + b)
        printDiffItems(10, 10);
    }

}
