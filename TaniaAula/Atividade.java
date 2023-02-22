package TaniaAula;
import java.util.Scanner;

public class Atividade {
    public static int fibo(int num) {
        if (num < 2) {
            return num;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }

    public static int fiboI(int num) {
        int segundoNum = 1;
        int startNum = 1;


        if (num <= 1) {
            return num;
        }

        for (int i = 2; i < num; i++) {
            int tempoNum = segundoNum;
            segundoNum += startNum;
            startNum = tempoNum;
        }
        return segundoNum;

    }

    public static int multi(int num) {
        int idex = 1;
        while(idex <= 100) {
            fibo(20);
            idex++;
        }
        return fibo(20);
    }

    public static int multiFIBO(int num) {
        int idex = 1;
        while(idex <= 100) {
            fiboI(20);
            idex++;
        }
        return fiboI(20);
    }

    public static void main(String[] args) {

        long OnI = System.nanoTime();
        fiboI(20);
        long OffI = System.nanoTime();
        long duracaoI = OffI - OnI;
        System.out.println("Tempo do iterativo em nano segundos: " + duracaoI);


        long OnRecu = System.nanoTime();
        fibo(20);
        long OffRecu = System.nanoTime();
        long duracao = OffRecu - OnRecu;
        System.out.println("Tempo do recursivo em nano segundos: " + duracao);

        long on = System.currentTimeMillis();
        fiboI(20);
        long off = System.currentTimeMillis();
        long dura = off - on;
        System.out.println("Tempo do iterativo em milissegundos: " + dura);

        long on2 = System.currentTimeMillis();
        fibo(20);
        long off2 = System.currentTimeMillis();
        long dura2 = off2 - on2;
        System.out.println("Tempo do recursivo em milissegundos: " + dura2);
    }
}
