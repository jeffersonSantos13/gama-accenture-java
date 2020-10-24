package exercise07.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class exeTest {

    public static void main(String[] args) {
        Solution solution = new Solution();

        var fruits = solution.solutionExe1();

        System.out.println("Exercise 01");
        System.out.println(fruits);

        System.out.println("\nExercise 02");
        solution.solutionExe2(fruits);

        System.out.println("\nExercise 03");
        var fruitsSize = solution.solutionExe3(fruits);
        System.out.println(fruitsSize);

        System.out.println("\nExercise 04");
        solution.solutionExe4(fruits, "banana");
        System.out.println(fruits);

        solution.addSetList(fruits, "");

        System.out.println("\nExercise 05");
        solution.solutionExe5(fruits);
        boolean listIsEmpty = solution.solutionExe5_2(fruits);
        System.out.println(listIsEmpty);
        Set<String> hashListEmpty = new HashSet<>();
        boolean hashListIsEmpty = solution.solutionExe5_2(hashListEmpty);
        System.out.println(hashListIsEmpty);

        System.out.println("\nExercise 06");
        solution.solutionExe6(fruits, hashListEmpty);
        System.out.println(hashListEmpty);

        System.out.println("\nExercise 07");
        String[] arrayHashSet = solution.solutionExe7(fruits);
        System.out.println(Arrays.toString(arrayHashSet));

        System.out.println("\nExercise 08");

        System.out.println("\nExercise 09");
        var arrayListConvertedToHashList= solution.solutionExe9(fruits);
        System.out.println(arrayListConvertedToHashList);

        System.out.println("\nExercise 10");
        System.out.println("Compare: " + fruits + hashListEmpty);
        boolean compareHashList = solution.solutionExe10(fruits, hashListEmpty);
        System.out.println(compareHashList);

        Set<String> HashListEmptyToCompare = new HashSet<>();
        System.out.println("Compare: " + fruits + HashListEmptyToCompare);
        boolean compareHashListEmptyIs = solution.solutionExe10(fruits, HashListEmptyToCompare);
        System.out.println(compareHashListEmptyIs);

        System.out.println("\nExercise 11");
        HashListEmptyToCompare.add("Melon");
        var retainElements = solution.solutionExe11(fruits, HashListEmptyToCompare);
        System.out.println(fruits);
        System.out.println(HashListEmptyToCompare);
        System.out.println(retainElements);

        System.out.println("\nExercise 12");
        System.out.println(fruits);
        solution.solutionExe12(fruits);
        System.out.println(fruits);
    }

}
