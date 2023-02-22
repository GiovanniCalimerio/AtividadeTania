package TaniaAula;

public class atividadeFat {
    public static int FatRe(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return FatRe(num - 1) * num;
        }
    }

    public static int FatI(int num) {
        int Fat = 1;
        for (int i = 0; i <= num; i++) {
            Fat = Fat * i;
        }
        return Fat;
    }

    public static int MultiFat(int num) {
        int idex = 1;
        while(idex <= 100) {
            FatRe(20);
            idex++;
        }
        return FatRe(20);
    }

    public static int MultiI(int num) {
        int idex = 1;
        while(idex <= 100) {
            FatI(20);
            idex++;
        }
        return FatI(20);
    }

    public static void main(String[] args) {
        long OnI = System.nanoTime();
        FatI(20);
        long OffI = System.nanoTime();
        long duracaoI = OffI - OnI;
        System.out.println("Tempo do iterativo em nano segundos: " + duracaoI);


        long startRecursivo = System.nanoTime();
        FatRe(20);
        long endRecursivo = System.nanoTime();
        long duration = endRecursivo - startRecursivo;
        System.out.println("Tempo do recursivo em nano segundos: " + duration);

        long OnR = System.currentTimeMillis();
        FatI(20);
        long OffR = System.currentTimeMillis();
        long dura = OffR - OnR;
        System.out.println("Tempo do iterativo em milissegundos: " + dura);

        long OnR2 = System.currentTimeMillis();
        FatRe(20);
        long OffR2 = System.currentTimeMillis();
        long dura2 = OffR2 - OnR2;
        System.out.println("Tempo do recursivo em milissegundos: " + dura2);
    }
}