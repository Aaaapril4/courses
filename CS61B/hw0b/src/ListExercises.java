import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (int elem : L) {
            sum += elem;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evenL = new ArrayList<>();
        for (int elem : L) {
            if (elem % 2 == 0) {
                evenL.add(elem);
            }
        }
        return evenL;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commonL = new ArrayList<>();
        for (int elem : L1) {
            if (L2.contains(elem)) {
                commonL.add(elem);
            }
        }
        return commonL;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int numOccur = 0;
        for (String word : words) {
            if (word.indexOf(c) != -1) {
                numOccur += 1;
            }
        }
        return numOccur;
    }
}
