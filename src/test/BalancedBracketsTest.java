package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    // Test 1 Assert True when only brackets
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    // Test 2 Assert true when there are brackets inside of brackets
    public void bracketsInsideOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    // Test 3 Assert true when a bracket is at beginning and end string
    public void bracketsAtBeginningAndEndOFString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    // Test 4 Assert true when brackets are inside and end of string
    public void bracketsInsideAndAtEndOfString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    // Test 5 Assert true when brackets are at the front of the string
    public void bracketsAreAtStartOfString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    // Test 6 Assert true when where are spaces in the sting contained in the brackets
    public void backetsContainlineOfTextWithSpaces() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This is a line of text]"));
    }
    @Test
    // Test 7 Assert true when there are multiple lines of text contained inside the brackets
    public void bracketsContainingSeveralLinesOfText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This is the first line of text" + "This is the second line of text]"));
    }
    @Test
    // Test 8 Assert false when brackets are backwards
    public void bracketsAreClosedBackwards() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    // Test 9 Assert false when a bracket is left open at the beginning
    public void bracketLeftOpen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode..."));
    }
    @Test
    // Test 10 Assert false when brackets ar reversed inside of a string
    public void bracketReversedInString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    // Test 11 Assert false when single is present
    public void bracketSingleWithNoText() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    // Test 12 Test Assert false when no open bracket at beginning
    public void bracketNotAtStartButAtEnd() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
}