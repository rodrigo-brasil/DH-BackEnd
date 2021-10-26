package Flyweight.Floresta;


import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Floresta floresta = new Floresta();

//        floresta.plantarAvore("Florífera","azul",100 ,200);

        IntStream.range(0,500_000).forEach( i -> floresta.plantarAvore("Frutíferas","Red",500,300));
        IntStream.range(0,500_000).forEach( i -> floresta.plantarAvore("Ornamentais","Green",200,400));
        floresta.printFloresta();

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() -runtime.freeMemory()) / (1024 * 1024));

    }
}
