package entities;

/**
 * SushiTable holds all the sushi objects needed for a person to eat sushi
 */
public class SushiTable {

    SoySauce soySauce;
    SushiPlate sushiPlate;

    public SushiTable(int index) {
        soySauce = new SoySauce(index);
        sushiPlate = new SushiPlate(index);
    }
}
