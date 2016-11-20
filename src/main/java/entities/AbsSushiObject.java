package entities;

/**
 * Abstract class for a sushi table object ("Sushi plate" or "Soy sauce")
 */
abstract class AbsSushiObject implements Runnable
{
    /**
     * true / false if this sushi table object ("Sushi plate" or "Soy sauce") is available or not
     */
    private boolean available;

    /**
     * Name of the Sushi eater thread will be saved here for nice and verbose printing
     */
    private String takenThread = null;

    /**
     * either "Sushi plate" or "Soy sauce", set on deriving class
     */
    String objectName;

    /**
     * outer loop iteration index
     */
    private int index;

    AbsSushiObject(int index_) {
        available = true; //set the object as available
        index = index_; //save the outer loop index for printing
    }

    public void run() {
        if (available) {
            //if available, give it away and make it unavailable
            System.out.println(objectName + " is given to: " + Thread.currentThread().getName());
            available = false;
            takenThread = Thread.currentThread().getName();
        }
        else {
            if (takenThread.equals(Thread.currentThread().getName())) {
                //if not available but was called by the original holder, release it.
                System.out.println(objectName + " released by: " + Thread.currentThread().getName());
                available = true;
                takenThread = null;
            }
            else {
                //if not available but was NOT called by the original holder, we have an Error!
                System.out.println(String.format(
                        "Error! %1$s can't take %2$s! it is already taken by %3$s",
                        Thread.currentThread().getName(), objectName, takenThread));
                System.out.println(String.format("\n\nProblem in index %1$s\n\n", index));
            }
        }
    }
}
