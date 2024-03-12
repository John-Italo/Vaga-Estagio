package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Digite um número para ver se esta na sequencia: ");
        num = in.nextInt();
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        if(num == Fibonacci.fibo(i)){
            System.out.println("Esse numero pertence a sequencia!! ");
        }else{
            System.out.println("Esse numero não pertence a sequencia!!");
        }
        
        
        
    }

}
}