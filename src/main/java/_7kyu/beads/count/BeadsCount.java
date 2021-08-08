package _7kyu.beads.count;

/**
 * https://www.codewars.com/kata/58712dfa5c538b6fc7000569/train/java
 *
 */
public class BeadsCount {
    public static int countRedBeads(final int nBlu) {
        if (nBlu < 2) {
            return 0;
        }
        return nBlu * 2 - 2;
    }
}
