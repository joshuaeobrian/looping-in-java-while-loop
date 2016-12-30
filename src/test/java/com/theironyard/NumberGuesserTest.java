package com.theironyard;

import net.doughughes.testifier.exception.CannotFindMethodException;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.test.TestifierTest;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class NumberGuesserTest extends TestifierTest{

    @Test
    public void testGuessNumber5From1To10() {
        /* arrange */

        /* act */
        int guess = NumberGuesser.guessNumber(5, 10);

        /* assert */
        assertThat("The guessed number should be 5.",
                guess, equalTo(5));
        assertThat("The guessNumber() method should have printed a string reading, 'It took X tries to guess your number.' where x is the number of attempts made.",
                outputWatcher.getPrinted().size(), greaterThan(0));
        assertThat("The guessNumber() method should have printed a string reading, 'It took X tries to guess your number.' where x is the number of attempts made.",
                outputWatcher.getPrinted().get(0), RegexMatcher.matches("^It took \\d+ tries to guess your number.$"));
    }

    @Test
    public void testGuessNumber0From0To0() {
        /* arrange */

        /* act */
        int guess = NumberGuesser.guessNumber(0, 0);

        /* assert */
        assertThat("The guessed number should be 0.",
                guess, equalTo(0));
        assertThat("The guessNumber() method should have printed a string reading, 'It took 1 tries to guess your number.'",
                outputWatcher.getPrinted().size(), greaterThan(0));
        assertThat("The guessNumber() method should have printed a string reading, 'It took 1 tries to guess your number.'",
                outputWatcher.getPrinted().get(0), RegexMatcher.matches("^It took 1 tries to guess your number.$"));
    }

    @Test
    public void testGuessNumberShouldUseWhileLoop(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("guessNumber", int.class, int.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The guessNumber() method should use a while loop.",
                source, RegexMatcher.matches("^.*?WhileStmt.*?$"));
    }
}