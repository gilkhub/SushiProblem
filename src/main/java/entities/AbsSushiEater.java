package entities;

/**
 * Abstract class for a person who eats sushi (Like Nir and Daniel)
 */
abstract class AbsSushiEater extends Thread {

    /**
     * SushiTable holds all the sushi objects needed for a person to eat sushi
     */
    private SushiTable sushiTable;

    AbsSushiEater(String name_, SushiTable sushiTable_) {
        this.sushiTable = sushiTable_;
        setName(name_);
    }

    /**
     * Eat routine should be personally overridden in deriving class
     */
    public abstract void eatRoutine();

    public void run() {
        eatRoutine();
    }

    void eat() {
        System.out.println(String.format("%1$s is now eating.", getName()));
    }

    void takeSushiPlate() {
        System.out.println(String.format("%1$s is now taking the sushi plate.", getName()));
        sushiTable.sushiPlate.run();
    }

    void returnSushiPlate() {
        System.out.println(String.format("%1$s is now returning the sushi plate.", getName()));
        sushiTable.sushiPlate.run();
    }

    void pickSushiRoll() {
        System.out.println(String.format("%1$s is now picking a sushi roll.", getName()));
    }

    void takeSoySauce() {
        System.out.println(String.format("%1$s is now taking the soy sauce.", getName()));
        sushiTable.soySauce.run();
    }

    void returnSoySauce() {
        System.out.println(String.format("%1$s is now returning the soy sauce.", getName()));
        sushiTable.soySauce.run();
    }
}
