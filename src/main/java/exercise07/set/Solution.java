package exercise07.set;

import java.util.*;

public class Solution {

    public boolean addSetList(Set<String> fruits, String hashList) {
        return fruits.add(hashList);
    }

    public Set<String> solutionExe1 () {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("Water melon");
        fruits.add("Melon");
        return fruits;
    }

    public void solutionExe2(Set<String> fruits) {
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public int solutionExe3(Set<String> fruits) {
        return fruits.size();
    }

    public void solutionExe4(Set<String> fruits, String hashString) {
        // fruits.removeIf(fruit -> fruit.contains(hashString.toLowerCase()));
        fruits.remove(hashString);
    }

    public void solutionExe5(Set<String> fruits) {
        for (String fruit : fruits) {
            if (fruit.isEmpty()) {
                System.out.println("Vazio");
            } else {
                System.out.println(fruit);
            }
        }
    }

    public boolean solutionExe5_2(Set<String> hashlist) {
        return hashlist.isEmpty();
    }

    public void solutionExe6(Set<String> fruits, Set<String> newHashFruits) {
        newHashFruits.addAll(fruits);
    }

    public String[] solutionExe7(Set<String> set) {
        String [] convertedHashListToArrayList = new String[set.size()];
        set.toArray(convertedHashListToArrayList);
        return convertedHashListToArrayList;
    }

    public List<String> solutionExe9(Set<String> sets) {
        List<String> convertedHashListToArrayList = new ArrayList<>();

        convertedHashListToArrayList.addAll(sets);

        return convertedHashListToArrayList;
    }

    public boolean solutionExe10(Set<String> firstListHash, Set<String> secondListHash) {
        return firstListHash.equals(secondListHash);
    }

    public Set<String> solutionExe11(Set<String> firstListHash, Set<String> secondListHash) {
        Set<String> newListHash = new HashSet<>();

        for (String firstSet : firstListHash ) {
            boolean containInHashSet = secondListHash.contains(firstSet);
            if (containInHashSet) {
                newListHash.add(firstSet);
            }
        }

        return newListHash;
    }

    public void solutionExe12(Set<String> fruits) {
        fruits.clear();
    }

}
