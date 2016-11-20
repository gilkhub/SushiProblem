import entities.*;

public class ProblemMain {

    public static void main(String[] args) {

        for (int i=0; i < 10000; i++) {
            SushiTable sushiTable = new SushiTable(i);

            Nir nir = new Nir(sushiTable);
            Daniel daniel = new Daniel(sushiTable);

            nir.start();
            daniel.start();
        }
    }
}
