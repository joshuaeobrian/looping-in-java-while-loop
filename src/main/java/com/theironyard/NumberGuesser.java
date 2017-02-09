package com.theironyard;

/**
 * This class is used to guess a number up to a given number. It has one static
 * method, guessNumber(). Your job is to implement it as described below.
 */
public class NumberGuesser {

    /**
     * The guessNumber() method attempts to guess a number between 0 and an
     * upper limit. It does this by using the Java's Random class' nextInt()
     * method. You can read the documentation on nextInt() at this URL:
     *
     * https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt--
     *
     * All you really need to know is that you can get a random integer from 0
     * to (but not including) an upper limit number using nextInt(). Assume you
     * want a random number between 0 and 10. The number could be 0, 5, 10, etc,
     * but not 11 or -500. You can get this random number using this code:
     *
     * new Random().nextInt(11);
     *
     * Note that we pass 11 in as the argument to nextInt(). This is because
     * nextInt() returns a random number between 0 and 11 exclusive. IE: 11 is
     * not included and 10 is the maximum random number.
     *
     * The arguments to the guessNumber() method are:
     *
     * - correctNumber: this is the number Java is trying to guess.
     * - upTo: this is the maximum number to guess. This is inclusive! If your
     * upTo value is 10 then Java can guess 10.
     *
     * This method must return the correctly guessed number. So, if the number
     * to guess is 5, then 5 is the correct return value.
     *
     * This method will be implemented by using a while loop that will continue
     * to execute until the correct number is guessed. That means that on each
     * iteration of the loop you will need to guess a number. If that number is
     * incorrect you will keep running the loop. If it's correct you will stop
     * executing the loop.
     *
     * Finally, before returning the guessed number, the method should output to
     * the console a string indicating the number of attempts made. For example:
     * "It took 5 tries to guess your number." The text should be exactly as
     * specified, except for the number.
     *
     */
    public static int guessNumber(int correctNumber, int upTo){
        // todo: make an initial guess at the correct number



        // todo: loop while the guess is incorrect. Be sure to use a while loop.



            // todo: guess again



        // todo: output a string indicating the number of guesses made. It should read "It took XYZ tries to guess your number.", where XYZ is the number of attempts made.


        // todo: return the guessed number
        return -100;
    }

}
