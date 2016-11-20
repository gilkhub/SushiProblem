package entities;

public class Nir extends AbsSushiEater {

    public Nir(SushiTable sushiTable) {
        super("Nir", sushiTable);
    }

    public void eatRoutine() {
        takeSoySauce();
        takeSushiPlate();
        pickSushiRoll();
        returnSoySauce();
        returnSushiPlate();
        eat();
    }
}
