package entities;

public class Daniel extends AbsSushiEater {

    public Daniel(SushiTable sushiTable) {
        super("Daniel", sushiTable);
    }

    public void eatRoutine() {
        takeSushiPlate();
        takeSoySauce();
        pickSushiRoll();
        returnSushiPlate();
        returnSoySauce();
        eat();
    }
}
